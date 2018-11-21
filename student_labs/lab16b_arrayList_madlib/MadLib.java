package lab16b_arrayList_madlib;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;
import java.util.Arrays;

public class MadLib {

    private ArrayList<String> verbs;
    private ArrayList<String> nouns;
    private ArrayList<String> adjectives;
    private String story;

    public MadLib() {
    }

    public MadLib(String fileName) {
        //load stuff


        try {
            Scanner file = new Scanner(new File(fileName));
            while (file.hasNext()){
                story = file.nextLine();
            }

        } catch (Exception e) {
            out.println("Houston we have a problem!");
        }

    }

    private void loadNouns() {
        nouns = new ArrayList();
        
        try {
            
            Scanner file = new Scanner(new File("nouns.dat"));
            while (file.hasNext()){
                nouns.add(file.nextLine());
                
            }
        } catch (Exception e) {
        }
        

    }

    private void loadVerbs() {
        verbs = new ArrayList();
        try {
            Scanner file = new Scanner(new File("verbs.dat"));
            while (file.hasNext()){
                verbs.add(file.nextLine());
            }
        } catch (Exception e) {
        }
        

    }

    private void loadAdjectives() {
        adjectives = new ArrayList();
        try {
            Scanner file = new Scanner(new File("adjectives.dat"));
            while (file.hasNext()){
                adjectives.add(file.nextLine());
            }
        } catch (Exception e) {
        }
        

    }

    public String getRandomVerb() {
        loadVerbs();
        return verbs.get((int)(verbs.size() * Math.random()));
    }

    public String getRandomNoun() {
        loadNouns();
        return nouns.get((int)(nouns.size() * Math.random()));
    }

    public String getRandomAdjective() {
        loadAdjectives();
        return adjectives.get((int)(adjectives.size() * Math.random()));
    }

    public String toString() {
        String output;
        output = story;
        
        for (int i = story.length()-1; i > 0; i--){
            if (story.charAt(i) == '#'){
                output = output.substring(0, i) + getRandomNoun() + output.substring(i+1);
            }
            else if (story.charAt(i) == '@'){
                output = output.substring(0, i) + getRandomVerb() + output.substring(i+1);
            }
            else if (story.charAt(i) == '&'){
                output = output.substring(0, i) + getRandomAdjective() + output.substring(i+1);
            }
        }
        return output;
    }
}