package lab09_while_dowhile;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class StringRemover {

    private String sentence;
    private String remove;

    //add in constructors
    public StringRemover(){
        setRemover("", "");
    }
    
    public StringRemover(String s, String rem){
        setRemover(s, rem);
    }
    
    public void setRemover(String s, String rem) {
        sentence = s;
        remove = rem;
    }

    public String removeStrings() {
        String cleaned = sentence;
        while (cleaned.indexOf(remove) != -1){
            cleaned = cleaned.substring(0, cleaned.indexOf(remove) - 1) +
                    cleaned.substring(cleaned.indexOf(remove) + remove.length());
        }
        return cleaned + "\n";
    }

    public String toString() {
        return sentence + " - String to remove " + remove;
    }
}