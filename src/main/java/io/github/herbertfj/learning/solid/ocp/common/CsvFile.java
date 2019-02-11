package io.github.herbertfj.learning.solid.ocp.common;

import org.w3c.dom.Text;

import java.io.File;

public class CsvFile extends File {
    public CsvFile(String pathname) {
        super(pathname);
    }

    public Text getText() {
        return null;
    }
}
