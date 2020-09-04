package Ex4.Users;

import Ex4.IAuthenticable;
import Ex4.User;

import java.util.Base64;

public class Administrator extends User implements IAuthenticable {

    private String goldenKey;

    public Administrator(String name, String lastName, String phoneNumber, String email, String goldenKey) {
        super(name, lastName, phoneNumber, email);
        this.goldenKey = goldenKey;
    }

    @Override
    public String welcomeMessage() {
        return "Welcome, " + name + " " + lastName + " , you are an Administrator.";
    }

    @Override
    public String authenticateSuperUser() {
        String string = "Bearer " + goldenKey;
        return Base64.getEncoder().encodeToString(string.getBytes());
    }

    public String getGoldenKey()
    {
        return goldenKey;
    }
}
