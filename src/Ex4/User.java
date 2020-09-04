package Ex4;

public abstract class User {
    protected String name;
    protected String lastName;
    protected String phoneNumber;
    protected String email;

    public User(String name, String lastName, String phoneNumber, String email) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public abstract String welcomeMessage();
}
