package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 23);
        userService.saveUser("Петя", "Сидоров", (byte) 30);
        userService.saveUser("Михаил", "Лебедев", (byte) 27);
        userService.saveUser("Сергей", "Смирнов", (byte) 41);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
