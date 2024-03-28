package com.adepuu.exercises.session8;

enum STATUS {
    NOT_STARTED,
    IN_PROGRESS,
    BLOCKED,
    DONE
}
public class Todo {
    private String message;
    public Todo(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
