package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();
        userService.saveUser("Petya", "Ivanov", (byte) 25);
        userService.saveUser("Marya", "Sidorova", (byte) 69);
        userService.saveUser("Ivan", "Petrov", (byte) 37);
        userService.saveUser("Marina", "Kukushkina", (byte) 31);
        userService.removeUserById(2);
        userService.getAllUsers();
       userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}