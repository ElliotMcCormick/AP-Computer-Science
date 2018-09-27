package lab05a_ifs_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer {

    private char theChar;

    public CharacterAnalyzer() {
        setChar(' ');
    }

    public CharacterAnalyzer(char c) {
        setChar(c);
    }

    public void setChar(char c) {
        theChar = c;
    }

    public char getChar() {
        return theChar;
    }

    public boolean isUpper() {
        if (theChar >= 65 && theChar < 97){
            return true;
        }
        return false;
    }

    public boolean isLower() {
        if (theChar >= 97){
            return true;
        }
        return false;
    }

    public boolean isNumber() {
        if(theChar >= 48 && theChar < 65){
            return true;
        }
        return false;
    }

    public int getASCII() {
        int asciiNum = theChar;
        return asciiNum;
    }

    public String toString() {
        return "" + getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
    }
}