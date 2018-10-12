package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class VowelCounter {
    
    

    public static String getNumberString(String s) {
        for (int i = 0; i < s.length(); i++){
            char t = s.toLowerCase().charAt(i);
            char num = 48;
            System.out.println(t);
            if (t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u'){
                s.replace(s.charAt(i), 'h');
                num++;
                System.out.println(num);
                if (num > 57){
                    num = 48;
                }
            }
        }
        return null;
    }
}
