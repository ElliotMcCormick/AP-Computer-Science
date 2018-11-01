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
        
        //variable for number of spaces between the letters
        int numSpaces = 1;
        
        /* 
        repeat for the length of the word minus the last line
        basically sets the height of the triangle
        */
        for (int i = 0; i < word.length()-1; i++){
           
            //sets the spaces per line before the letter
            for (int j = word.length()-1; j > i; j--){
               output += " "; 
            }          
            // if not the first row
            if (i != 0){              
                //repeat twice
                for (int l = 0; l < 2; l++){                    
                    //prints letter we are on
                    output += word.charAt(i);
                    
                    //prints spaces between the letters           
                    for (int p = 0; p < numSpaces; p++){ 
                        output += " ";
                    }              
                }   
                // the number of spaces between the letters goes up by two for each new line
                numSpaces += 2;
            }             
            else {             
                //if in first row print out char at 0
                output += word.charAt(0);
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