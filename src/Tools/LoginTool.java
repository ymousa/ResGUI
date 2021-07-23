package Tools;

import Datenobjekte.User;

import java.io.IOException;

public class LoginTool extends FileTools {


    public LoginTool() throws IOException {
    }

    public static User verify(String username, String password) {
        if (hmUser.containsKey(username)) {
            User tempUser = hmUser.get(username);
            if (tempUser.getsUsername().equals(username) &&
                    tempUser.getsPass().equals(password)) {
                System.out.println("Success!");
                return tempUser;
            }
        }
        System.out.println("Please try again..");
        return null;
    }

    public static void newAccount(String name, String username, String password) throws IOException {

        User newUser = new User(name, username, password);
        hmUser.put(username, newUser);
        System.out.println("sing in a new Account: succsess!");
    }
}
