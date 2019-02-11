package io.github.herbertfj.learning.solid.srp.bad;

import io.github.herbertfj.learning.solid.srp.common.User;
import io.github.herbertfj.learning.solid.srp.common.UserReader;

class MysqlUserRetriever implements UserReader {
    private final String databaseUrl;

    private MysqlConnection connection;

    MysqlUserRetriever(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    @Override
    public User get(String id) {
        openConnection();

        MysqlDriver driver = new MysqlDriver(connection);

        ReadResult result = driver.read("SELECT id, name FROM USER WHERE id = ?", id);

        User retrievedUser = result.read(row -> {
            String userId = row.getString("id");
            String name = row.getString("name");

            return new User(userId, name);
        });

        closeConnection();

        retrievedUser.setName(retrievedUser.getName().toUpperCase());

        return retrievedUser;
    }

    private void openConnection() {
        if (connection == null) {
            connection = new MysqlConnection(databaseUrl);
        }
        if (!connection.isOpen()) {
            connection.open();
        }
    }

    private void closeConnection() {
        connection.close();
    }
}
