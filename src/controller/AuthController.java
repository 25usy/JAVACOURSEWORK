package controller;

import model.User;
import model.UserManager;

public class AuthController {

    private UserManager userManager;

    public AuthController() {
        userManager = new UserManager();
    }

    public User login(String username, String password, String role) {
        return userManager.validateLogin(username, password, role);
    }
}
