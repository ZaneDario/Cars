package Ex4;

import Ex4.Users.Administrator;
import Ex4.Users.BaseUser;
import Ex4.Users.ExternalUser;
import Ex4.Users.SystemUser;

import java.util.Base64;

public class Main {
    public static void main(String[] args) {

        Administrator manolo = new Administrator
                ("manolo", "rey", "658111111", "manolo@company.es", "manolo777");

        SystemUser paquito = new SystemUser
                ("paquito", "reyo", "658111112", "paquito@company.es", "paquito777");

        BaseUser juan = new BaseUser
                ("juan", "reyes", "658111113", "juan@company.es");

        ExternalUser teo = new ExternalUser
                ("teo", "reyu", "658111114", "teo@company.es", "that company");

        if(Login.acceptExternalUser(teo))
            System.out.println("Teo has been login successfully");

        if(Login.acceptSuperUser(manolo, "jhdakb"))
            System.out.println("Manolo has been login successfully");

        if(Login.acceptSuperUser(paquito, goldenKeyToBase64(paquito.getGoldenKey())))
            System.out.println("Paquito has been login successfully");

        Login.acceptUser(juan);
        Login.acceptUser(manolo);
        Login.acceptUser(paquito);
        Login.acceptUser(teo);
    }

    public static String goldenKeyToBase64(String goldenKey)
    {
        String string = "Bearer " + goldenKey;
        byte[] encodedBytes = Base64.getEncoder().encode(string.getBytes());
        return encodedBytes.toString();
    }
}
