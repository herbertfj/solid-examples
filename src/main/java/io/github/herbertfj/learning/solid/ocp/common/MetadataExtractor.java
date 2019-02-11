package io.github.herbertfj.learning.solid.ocp.common;

import java.io.File;

public interface MetadataExtractor {
    String readMetadata(File file);
}
