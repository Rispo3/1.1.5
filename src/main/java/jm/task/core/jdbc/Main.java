package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Владимир", "Путин", (byte) 70);
        userService.saveUser("Джо", "Байден", (byte) 75);
        userService.saveUser("Дональд", "Трамп", (byte) 65);
        userService.saveUser("Владимир", "Жириновский", (byte) 74);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}

