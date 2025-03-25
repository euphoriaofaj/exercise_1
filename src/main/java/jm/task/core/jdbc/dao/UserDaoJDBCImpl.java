package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class UserDaoJDBCImpl implements UserDao {
    private Connection con;
    public UserDaoJDBCImpl() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db", "root", "imgbas01");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void createUsersTable() {
        String createString = "CREATE TABLE IF NOT EXISTS users (" +
                "ID BIGINT AUTO_INCREMENT PRIMARY KEY, " +
                "NAME VARCHAR(50) NOT NULL, " +
                "LAST_NAME VARCHAR(50) NOT NULL, " +
                "AGE TINYINT NOT NULL" +
                ")";

        try (Statement stmt = con.createStatement()) {
            stmt.executeUpdate(createString);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void dropUsersTable() {
        String dropString = "DROP TABLE IF EXISTS users";

        try (Statement stmt = con.createStatement()) {
            stmt.executeUpdate(dropString);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void saveUser(String name, String lastName, byte age) {


    }

    public void removeUserById(long id) {


    }

    public List<User> getAllUsers() {
        return null;

    }

    public void cleanUsersTable() {


    }
}


