package lab14a_array_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class RomanNumeral {

    private Integer number;
    private String roman;
    private final static int[] NUMBERS = {1000, 900, 500, 400, 100, 90,
        50, 40, 10, 9, 5, 4, 1};
    private final static String[] LETTERS = {"M", "CM", "D", "CD", "C", "XC",
        "L", "XL", "X", "IX", "V", "IV", "I"};

    public RomanNumeral(String str) {
        setRoman(str);
    }

    public RomanNumeral(Integer orig) {
        setNumber(orig);   
    }

    public void setNumber(Integer num) {
        number = num;
    }

    public void setRoman(String rom) {
        roman = rom;
    }

    public Integer getNumber() {
        int output = 0;
        for (int i = 0; i < LETTERS.length; i++){
            if(!roman.substring(0,1).equals(LETTERS[i]) && !roman.substring(0,2).equals(LETTERS[i])){
                continue;
            } else {
                output += NUMBERS[i];
                roman = roman.substring(LETTERS[i].length());
            }
        }
        return output;
    }

    public String getRoman(){
        String output = "";
        for (int i = 0; i < NUMBERS.length; i++){
            while(number >= NUMBERS[i]){
               output += LETTERS[i];
               number -= NUMBERS[i];
            }
        }
        return output;
    }
    public String toString() {
        return getRoman() + "\n";
    }
}