package lab19c_interfaces_RomanNumeral_lab_java_aplus;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral implements Comparable<RomanNumeral> {

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
        Boolean done = false;
        
        //go through the letters list one at a time
        for (int i = 0; i < LETTERS.length; i++){
            
            if (done || roman.length() <= 0){
                break;
            }
            // if the roman numeral string is longer than 0 chars. . .
            if (roman.length() > 0){
                
                    // if the roman numeral is longer than one char and the index of letters is
                    // longer than one char (so two chars long). . .
                    if (roman.length() > 1 && LETTERS[i].length() > 1){
                        //while the first two letters match the index of letters . . .
                        while (roman.charAt(1) == LETTERS[i].charAt(1) && roman.charAt(0) == LETTERS[i].charAt(0)){
                            //add corresponding num to output
                            output += NUMBERS[i];
                  
                            if (roman.length() > 2){
                                roman = roman.substring(2);
                            } else { 
                                done = true;
                                break;
                            }
                        }
                    }  
                    else { 
                        while(roman.charAt(0) == LETTERS[i].charAt(0)){
                            output += NUMBERS[i];
                            
                            if (roman.length() > 1){
                                roman = roman.substring(1);
                            } else { 
                                done = true;
                                break;
                            }
                        }
                    }
    
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
    
    public boolean equals(RomanNumeral num){
        if (compareTo(num) == 0){
            return true; 
        }
        return false;
    }
    
    public int compareTo(RomanNumeral num){
        if(getNumber() > num.getNumber()){
            return 1;
        } else if (getNumber() < num.getNumber()){
            return -1;
        }
        
        return 0;
    }
    public String toString() {
        return getRoman() + "\n";
    }
}