package lab11a_nestedloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

class TriangleWord {

    private String word;

    public TriangleWord() {
        this("");
    }

    public TriangleWord(String w) {
        setWord(w);
    }

    public void setWord(String w) {
        word = w;
    }

    public String toString() {
        String output = "";
        int randomCounter = 1;
        /* 
        repeat for the length of the word minus the last line
        sets the hight of the triangle
        */
        for (int i = 0; i < word.length()-1; i++){
           
            //sets the spaces per line
            for (int j = word.length()-1; j > i; j--){
               output += " "; 
            } 
            //repeats twice if not the first row
            if (i != 0){
                for (int l = 0; l < 2; l++){
                    //prints letter we are on
                    output += word.charAt(i);
                    //prints spaces between the letters
                    
                    
                   
                    for (int p = 0; p < randomCounter; p++){ 
                        output += " ";
                    }
                    
                    
                    
                    
                }
                randomCounter += 2;
            } 
            else {
                output += word.charAt(i);
            }
            //goes to the next line
            output += "\n";
        }
        
        //last line
        for (int m = word.length() - 1; m >= 0; m--){ //prints the word backwards 
            output += word.charAt(m);
        }
        //prints the word minus the first letter
        output += word.substring(1);
        return output + "\n";
    }
}