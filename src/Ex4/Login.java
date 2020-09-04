package Ex4;

import Ex4.Users.ExternalUser;

public class Login {
    public static void acceptUser(User user)
    {
        System.out.println(user.welcomeMessage());
    }

    public static boolean acceptSuperUser(IAuthenticable user, String goldenKey)
    {
        if(goldenKey.equals(user.authenticateSuperUser()))
            return true;
        else
            return false;
    }

    public static boolean acceptExternalUser(ExternalUser user)
    {
        String[] companies = {"this company", "that company", "your company", "my company"};

        for (String company: companies) {
            if (company.equals(user.getCompany()))
                return true;
        }
        return false;
    }
}
