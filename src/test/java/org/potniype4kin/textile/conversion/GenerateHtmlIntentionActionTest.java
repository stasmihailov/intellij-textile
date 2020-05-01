package org.potniype4kin.textile.conversion;

import org.apache.commons.io.FilenameUtils;
import org.jetbrains.annotations.NotNull;
import org.jsoup.Jsoup;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenerateHtmlIntentionActionTest {
    /**
     * Expected html files should exist in same directory as source .textile files and should have same names as them,\
     * but with with .html extensions
     */
    private static String[] sourceTextileFiles() throws IOException {
        URL rootDir = GenerateHtmlIntentionActionTest.class.getClassLoader().getResource("conversion/");

        return Files.walk(Paths.get(rootDir.getPath()))
                .filter(path -> path.getFileName().toString().endsWith(".textile"))
                .map(p -> p.toAbsolutePath().toString())
                .toArray(String[]::new);
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("sourceTextileFiles")
    public void testSimpleHeaderOnlyFile(String textileFile) throws IOException {
        Path textileFilePath = Paths.get(textileFile);
        Path htmlFilePath = Paths.get(FilenameUtils.removeExtension(textileFilePath.toAbsolutePath().toString()) + ".html");
        if (!htmlFilePath.toFile().exists()) {
            throw new IllegalStateException("could not find corresponding expected .html file for .textile file " + textileFile);
        }

        List<String> textileFileContents = Files.readAllLines(textileFilePath);
        List<String> expectedHtmlFileContents = Files.readAllLines(htmlFilePath);

        String expectedHtml = String.join("\n", expectedHtmlFileContents);
        String actualHtml = generateHtml(textileFileContents);
        assertEquals(expectedHtml, actualHtml);
    }

    @NotNull
    private String generateHtml(List<String> sourceTextile) throws IOException {
        File source = generateTextileFile(sourceTextile);
        File target = new GenerateHtmlIntentionAction().generateHtmlFile(source.toPath());

        String generatedHtml = String.join("\n", Files.readAllLines(target.toPath()));
        deleteFile(source);
        deleteFile(target);

        return Jsoup.parse(generatedHtml).outerHtml();
    }

    private void deleteFile(File resultHtmlFile) {
        boolean deleted = resultHtmlFile.delete();
        if (!deleted) {
            throw new IllegalStateException("could not remove temp file " + resultHtmlFile.getPath());
        }
    }

    @NotNull
    private File generateTextileFile(List<String> lines) throws IOException {
        Path tempFile = Files.createTempFile("test-textile-file", "");
        Files.write(tempFile, lines, TRUNCATE_EXISTING);

        return tempFile.toAbsolutePath().toFile();
    }
}