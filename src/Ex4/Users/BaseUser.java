package Ex4.Users;

import Ex4.User;

public class BaseUser extends User {
    public BaseUser(String name, String lastName, String phoneNumber, String email) {
        super(name, lastName, phoneNumber, email);
    }

    @Override
    public String welcomeMessage() {
        return "Welcome, " + name + " " + lastName + " , you are a Base User.";
    }
}
