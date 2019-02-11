package io.github.herbertfj.learning.solid.srp.good;

import io.github.herbertfj.learning.solid.srp.common.User;
import io.github.herbertfj.learning.solid.srp.common.UserReader;

class UserRepository implements UserReader {
    private final DatabaseTemplate databaseTemplate;

    UserRepository(DatabaseTemplate databaseTemplate) {
        this.databaseTemplate = databaseTemplate;
    }

    @Override
    public User get(String id) {
        return databaseTemplate.readOne("SELECT * FROM User WHERE id = ?", id, User.class);
    }
}
