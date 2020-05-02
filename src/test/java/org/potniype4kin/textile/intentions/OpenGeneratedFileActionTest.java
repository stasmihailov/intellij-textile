package org.potniype4kin.textile.intentions;

import com.intellij.openapi.project.Project;
import com.intellij.testFramework.fixtures.LightJavaCodeInsightFixtureTestCase;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;

public class OpenGeneratedFileActionTest extends LightJavaCodeInsightFixtureTestCase {
    private Path tempFile;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        tempFile = Files.createTempFile("tmp-OpenGeneratedFileActionTest", "");
    }

    @Test
    public void testActionPerformed() {
        Project project = this.getProject();

        new OpenGeneratedFileAction(tempFile).openGeneratedFile(project);
        assertEquals(
                "axaxa",
                project.getWorkspaceFile().getPath());
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        boolean deleted = tempFile.toFile().delete();
        if (!deleted) {
            throw new IllegalStateException("could not delete " + tempFile.toAbsolutePath());
        }
    }
}