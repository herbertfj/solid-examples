package io.github.herbertfj.learning.solid.ocp.good;

import io.github.herbertfj.learning.solid.ocp.common.MetadataExtractor;

import java.io.File;

class JpegReader implements FileReader {
    private final MetadataExtractor metadataExtractor;

    JpegReader(MetadataExtractor metadataExtractor) {
        this.metadataExtractor = metadataExtractor;
    }

    @Override
    public String readFile(File file) {
        return metadataExtractor.readMetadata(file);
    }
}
