package Routines;

import Datenobjekte.User;
import Datenobjekte.Constans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Login extends Constans {


    public static User verfiyUser()throws IOException{
        is = new InputStreamReader(System.in);          //get User input: username and pass
        br= new BufferedReader(is);
        String[] sInputUser= {"Username","Pass"};
        System.out.print("Username: ");
        sInputUser[0] = br.readLine();
        System.out.print("Password: ");
        sInputUser[1] = br.readLine();


        User tempUser= hmUser.get(sInputUser[0]);      // mit hm.containsValue() geht nicht, weil eventuell 2 Terme mit drei

        if(tempUser.getsUsername().equals(sInputUser[0]) &&
                tempUser.getsPass().equals(sInputUser[1])){
            System.out.println("success");
            return hmUser.get(sInputUser[0]);
        }

        return null;

    }

    public static User newAccount()throws IOException{
        User newUser= new User();
        is = new InputStreamReader(System.in);          //get User input: username and pass
        br= new BufferedReader(is);
        System.out.print("Name: ");
        newUser.setsName(br.readLine());
        System.out.print("Username: ");
        newUser.setsUsername(br.readLine());
        System.out.print("Password: ");
        newUser.setsPass(br.readLine());

        hmUser.put(newUser.getsUsername(), newUser);
        return hmUser.get(newUser.getsUsername());
    }

}
