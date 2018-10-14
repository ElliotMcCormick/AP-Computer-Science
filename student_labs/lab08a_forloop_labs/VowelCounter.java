package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class VowelCounter {
    
    

    public static String getNumberString(String s) {
        int num = 48;
        for (int i = 0; i < s.length(); i++){
            char t = s.toLowerCase().charAt(i);
            
            if (t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u'){
                s = s.substring(0, i) + (char)num + s.substring(i+1);
                //System.out.println((char)num);
                num++;   
            }
            
            if (num > 57){
                num = 48;
            }
            
        }
        return s;
    }
}
