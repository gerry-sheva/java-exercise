package com.adepuu.exercises.session8;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {

    private ArrayList<Todo> todos;

    public ArrayList<Todo> getTodos() {
        return todos;
    }

    public void addTodo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input todo: ");
        String todo = scanner.nextLine();
        Todo newTodo = new Todo(todo);
        todos.add(newTodo);
    }
    public void setTodos(ArrayList<Todo> todos) {
        this.todos = todos;
    }

    public TodoList() {
        this.todos = new ArrayList<>();
    }
}
