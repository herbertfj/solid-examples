package io.github.herbertfj.learning.solid.ocp.good;

import io.github.herbertfj.learning.solid.ocp.common.CsvFile;
import io.github.herbertfj.learning.solid.ocp.common.TextReader;
import org.w3c.dom.Text;

import java.io.File;

public class CsvReader implements FileReader {
    private final TextReader textReader;

    public CsvReader(TextReader textReader) {
        this.textReader = textReader;
    }

    @Override
    public String readFile(File file) {
        Text text = ((CsvFile) file).getText();
        return textReader.readText(text);
    }
}
