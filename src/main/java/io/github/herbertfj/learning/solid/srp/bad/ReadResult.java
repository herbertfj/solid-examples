package io.github.herbertfj.learning.solid.srp.bad;

import java.util.function.Function;

interface ReadResult {

    <T> T read(Function<Row, T> mapper);

    interface Row {
        String getString(String field);
    }
}
