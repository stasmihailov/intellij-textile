package org.potniype4kin.textile.intentions;

import com.intellij.testFramework.ParsingTestCase;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.potniype4kin.textile.language.TextileParserDefinition;

public abstract class AbstractTextileParsingTest extends ParsingTestCase {
    public AbstractTextileParsingTest() {
        super("", "textile", new TextileParserDefinition());
    }

    @BeforeEach
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testPsi() {
        doTest(true);
    }

    @Override
    protected String getTestDataPath() {
        return "src/test/resources/conversion";
    }

    @Override
    protected boolean skipSpaces() {
        return false;
    }

    @Override
    protected boolean includeRanges() {
        return true;
    }

    @NotNull
    @Override
    protected String getTestName(boolean lowercaseFirstLetter) {
        return getTestFileNameWithoutExtension();
    }

    protected abstract String getTestFileNameWithoutExtension();
}
