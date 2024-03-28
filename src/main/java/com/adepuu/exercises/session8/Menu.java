package com.adepuu.exercises.session8;

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

        while (isRunning) {
//            Do the thing
            boolean isLoggedIn = false;
            if (!isLoggedIn) {
//                Authenticate user will return user
                User loggedInUser = auth.authenticate();
            }

        }
    }
}
