package com.adepuu.exercises.session8;

import java.util.Scanner;

public class Menu {

    public boolean isRunning;
    public Auth auth;

    public User user;

    public Menu() {
        this.isRunning = true;
        this.auth = new Auth();
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void start() {
        Auth auth = new Auth();
        boolean isLoggedIn = false;

        while (isRunning) {
//            Do the thing

            while (!isLoggedIn) {
//                Authenticate will return user
                User loggedInUser = auth.authenticate();
                setUser(loggedInUser);
                isLoggedIn = true;
//                Users already logged in
            }
            TodoList todoList = user.getTodoList();
            System.out.println("To do list:");
            for (Todo todo: todoList.getTodos()) {
                System.out.println(todo.getMessage());
            }
            choices();
        }
    }

    public void choices() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input 'add' to add task");
            String choice = scanner.nextLine();
            if (choice.equals("add")) {
//                add todo
                user.addTodo();
            }
        }

    }
}
