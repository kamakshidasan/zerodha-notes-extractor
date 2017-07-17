package org.folio;

import org.folio.parser.TableExtractor;
import org.folio.helper.RelativePaths;

import org.junit.Test;
import java.io.InputStream;

public class TableExtractorTest {

    @Test
    public void testExtractTables() throws Exception {
        TableExtractor tableExtractor = new TableExtractor();
        try(InputStream is = this.getClass().getClassLoader().getResourceAsStream(RelativePaths.CONTRACT_NOTES)) {
            tableExtractor.extractTables(is);
        }
    }
}
