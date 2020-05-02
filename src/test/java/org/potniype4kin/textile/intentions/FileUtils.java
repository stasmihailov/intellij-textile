package org.potniype4kin.textile.intentions;

import org.apache.commons.io.FilenameUtils;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {
    public static Path getAdjacentFileWithExtension(Path source, String extension) {
        Path htmlFilePath = Paths.get(FilenameUtils.removeExtension(source.toAbsolutePath().toString()) + "." + extension);
        if (!htmlFilePath.toFile().exists()) {
            throw new IllegalStateException("could not find corresponding expected ." + extension + " file for .textile file " + source);
        }

        return htmlFilePath;
    }
}
