package io.github.herbertfj.learning.solid.ocp.bad;

import io.github.herbertfj.learning.solid.ocp.common.*;
import org.w3c.dom.Text;

import java.io.File;

class FileReader {
    private final PdfParser pdfParser;
    private final TextReader textReader;
    private final MetadataExtractor metadataExtractor;

    FileReader(PdfParser pdfParser, TextReader textReader, MetadataExtractor metadataExtractor) {
        this.pdfParser = pdfParser;
        this.textReader = textReader;
        this.metadataExtractor = metadataExtractor;
    }

    String readFile(File file) {
        if (file instanceof PdfFile) {
            return pdfParser.parsePDF((PdfFile) file);
        }
        if (file instanceof CsvFile) {
            Text text = ((CsvFile) file).getText();
            return textReader.readText(text);
        }
        if (file instanceof JpegFile) {
            return metadataExtractor.readMetadata(file);
        }
        return null;
    }
}
