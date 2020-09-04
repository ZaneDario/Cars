package Ex4;

import Ex4.Users.Administrator;
import Ex4.Users.ExternalUser;
import Ex4.Users.SystemUser;

public class Login {
    public static void acceptUser(User user)
    {
        System.out.println(user.welcomeMessage());
    }

    public static boolean acceptSuperUser(Administrator user, String goldenKey)
    {
        if(user.authenticateSuperUser().equals(goldenKey))
            return true;
        else
            return false;
    }
    public static boolean acceptSuperUser(SystemUser user, String goldenKey)
    {
        if(user.authenticateSuperUser().equals(goldenKey))
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
