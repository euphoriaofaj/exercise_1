package jm.task.core.jdbc;
import jm.task.core.jdbc.util.Util;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.model.User;


public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Jennie", "Kim", (byte) 20);
        userService.saveUser("Sam", "Kim", (byte) 30);
        userService.saveUser("Anna", "Jones", (byte) 35);
        userService.saveUser("Luke", "Smith", (byte) 29);

        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}


