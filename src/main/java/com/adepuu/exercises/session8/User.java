package com.adepuu.exercises.session8;

import java.util.UUID;

public class User {
    private String id;
    private String username;
    private String password;
    private TodoList todoList;

    public User(String username, String password) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.username = username;
        this.password = password;
        this.todoList = new TodoList();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TodoList getTodoList() {
        return todoList;
    }

    public void setTodoList(TodoList todoList) {
        this.todoList = todoList;
    }
}
