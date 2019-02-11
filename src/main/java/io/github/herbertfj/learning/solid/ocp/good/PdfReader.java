package io.github.herbertfj.learning.solid.ocp.good;

import io.github.herbertfj.learning.solid.ocp.common.PdfFile;
import io.github.herbertfj.learning.solid.ocp.common.PdfParser;

import java.io.File;

class PdfReader implements FileReader {
    private final PdfParser pdfParser;

    PdfReader(PdfParser pdfParser) {
        this.pdfParser = pdfParser;
    }

    @Override
    public String readFile(File file) {
        return pdfParser.parsePDF((PdfFile) file);
    }
}
