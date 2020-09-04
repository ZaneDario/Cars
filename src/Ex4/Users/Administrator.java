package Ex4.Users;

import Ex4.ISuperUsable;
import Ex4.User;

import java.util.Base64;

public class Administrator extends User implements ISuperUsable {

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
        byte[] encodedBytes = Base64.getEncoder().encode(string.getBytes());
        return encodedBytes.toString();
    }

    public String getGoldenKey()
    {
        return goldenKey;
    }
}
