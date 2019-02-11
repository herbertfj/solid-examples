package io.github.herbertfj.learning.solid.srp.good;

public interface DatabaseTemplate {
    <T> T readOne(String table, String id, Class<T> userClass);
}
