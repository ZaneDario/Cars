package Ex4.Users;

import Ex4.User;

public class ExternalUser extends User {

    private int companyId;
    private String companyName;

    public ExternalUser(String name, String lastName, String phoneNumber, String email, String companyName) {
        super(name, lastName, phoneNumber, email);
        this.companyName = companyName;
    }

    @Override
    public String welcomeMessage() {
        return "Welcome, " + name + " " + lastName + " , you are a External User.";
    }

    public String getCompany()
    {
        return companyName;
    }
}
