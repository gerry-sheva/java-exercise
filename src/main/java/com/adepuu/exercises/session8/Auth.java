package com.adepuu.exercises.session8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Auth {
    public HashMap<String, User> users;

    public Auth() {
        this.users = new HashMap<>();
    }

    public User authenticate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        if (users.containsKey(username)) {
            return login(username);
        } else return register(username);
    }

    public User login(String username) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        User user = users.get(username);
        if (user.getPassword().equals(password)) {
//            Correct credentials, let them in
            return user;
        } else {
            System.out.println("Invalid credentials, please register yourself!");
            return register(username);
        }
    }

    public User register(String username) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input password for " + username);
        String password = scanner.nextLine();
        User user = new User(username, password);
        users.put(username, user);
        return user;
    }
}
