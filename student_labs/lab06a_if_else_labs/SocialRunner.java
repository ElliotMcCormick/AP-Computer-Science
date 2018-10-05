package lab06a_if_else_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class SocialRunner {

    public static void main(String args[]) {
        Social social = new Social("456-56-234");
        social.chopAndAdd();
        out.println(social);
        
        social.setWord("1-1-1");
        social.chopAndAdd();
        out.println(social);
        
        social.setWord("102-2-12");
        social.chopAndAdd();
        out.println(social);
        
        social.setWord("0-0-0");
        social.chopAndAdd();
        out.println(social);
        
        //add test cases
    }
}