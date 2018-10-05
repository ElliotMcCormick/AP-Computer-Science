package lab07a_if_else_if_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Decoder {

    private char letter;

    public Decoder() {
        setLetter(' ');
    }

    public Decoder(char let) {
        setLetter(let);
    }

    public void setLetter(char let) {
        letter = let;
    }

    public char decode() {
        char result = 0;
        if (Character.isUpperCase(letter)){
            result = Character.toLowerCase(letter);
        } 
        else if (Character.isLowerCase(letter)){
            result = Character.toUpperCase(letter);
        }
        else if (!Character.isAlphabetic(letter)){
            if (Character.isDigit(letter)){
                result = (char) (letter + 17);
                
            } else {
                result = '#';
            }
        }

        return result;
    }

    public String toString() {
        return letter + " decodes to " + decode();
    }
}