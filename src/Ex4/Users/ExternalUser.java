package Ex4.Users;

import Ex4.User;

public class ExternalUser extends User {

    private int companyId;

    public ExternalUser(String name, String lastName, String phoneNumber, String email) {
        super(name, lastName, phoneNumber, email);
    }

    @Override
    public String welcomeMessage() {
        return "Welcome, " + name + " " + lastName + " , you are a External User.";
    }

    public String getCompany()
    {
        return "Company name";
    }
}
