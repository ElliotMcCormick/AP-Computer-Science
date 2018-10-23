package lab10_boolean;

// A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

class PassWordCheck {

    private String password;

    public PassWordCheck() {
        password = "mchammergohammer";
    }

    public void check() {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the password :: ");
        while (!(password.equals(keyboard.nextLine()))){
            System.out.println("INVALID");
            System.out.print("Enter the password :: ");
        }
        
        System.out.println("VALID");
    }
}