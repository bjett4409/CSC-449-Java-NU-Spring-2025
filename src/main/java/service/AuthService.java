package service;

import model.User;
import model.Role;

public class AuthService {
    public boolean isAdmin(User user) {
        return user.getRole().equals(Role.ADMIN.name());
    }

    public boolean isAuthorized(User user, String action) {
        if (isAdmin(user)) {
            return true;
        }
        return action.equals("READ");
    }
}
