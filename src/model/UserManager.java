package model;

import java.util.ArrayList;

public class UserManager {

    private ArrayList<User> users;

    public UserManager() {
        users = new ArrayList<>();

        // Hardcoded users (ACCEPTED for coursework)
        users.add(new User("admin", "admin123", "admin"));
        users.add(new User("user", "user123", "user"));
    }

    public User validateLogin(String username, String password, String role) {

        for (User u : users) {
            if (u.getUsername().equals(username)
                && u.getPassword().equals(password)
                && u.getRole().equals(role)) {

                return u;
            }
        }
        return null;
    }
}
