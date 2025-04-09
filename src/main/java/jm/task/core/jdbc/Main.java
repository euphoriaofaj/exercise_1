package jm.task.core.jdbc;
import jm.task.core.jdbc.util.Util;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.model.User;
import java.util.List;




public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.dropUsersTable();
        userService.createUsersTable();


        userService.saveUser("Jennie", "Kim", (byte) 20);
        userService.saveUser("Sam", "Kim", (byte) 30);
        userService.saveUser("Anna", "Jones", (byte) 35);
        userService.saveUser("Luke", "Smith", (byte) 29);

        userService.getAllUsers().forEach(System.out::println);





    }

}


