package lab24g_sortsearch_wordsearch;

import java.util.*;
import java.io.*;

public class WordSearch {

    private String[][] m;

    public WordSearch(int size, String str) {
        m = new String[size][size];
        int index = 0;

        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {

                m[r][c] = str.substring(index, index + 1);
                index++;

            }
        }
    }

    public boolean isFound(String word) {
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                if (checkRight(word, r, c) || checkLeft(word, r, c) || checkUp(word, r, c) || checkDown(word, r, c)
                        || checkDiagUpRight(word, r, c) || checkDiagUpLeft(word, r, c) || checkDiagDownRight(word, r, c)
                        || checkDiagDownLeft(word, r, c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkRight(String w, int r, int c) {
        String check = "";

        if (c + w.length() <= m[r].length) {

            for (int i = c; i < c + w.length(); i++) {
                check += m[r][i];
            }
        }
        
        return check.equals(w);
    }

    public boolean checkLeft(String w, int r, int c) {
        String check = "";

        if (c - w.length() >= 0) {

            for (int i = c; i > c - w.length(); i--) {
                check += m[r][i];
            }
        }
        
        return check.equals(w);
    }

    public boolean checkUp(String w, int r, int c) {
        String check = "";

        if (r - w.length() >= 0) {

            for (int i = r; i > r - w.length(); i--) {
                check += m[i][c];
            }
        }
        
        return check.equals(w);
    }

    public boolean checkDown(String w, int r, int c) {
        String check = "";

        if (r + w.length() <= m.length) {

            for (int i = r; i < r + w.length(); i++) {
                check += m[i][c];
            }
        }
        
        return check.equals(w);
    }

    //NOTE : For the purpose of solving the lab these are useless, none of the 
    //  words we are looking for are on the diagonal. But I'll write them anyways. 
    
    public boolean checkDiagUpRight(String w, int r, int c) {
        String check = "";
        
        if(c + w.length() <= m[r].length && r - w.length() >= 0){
            for (int j = r; j > r - w.length(); j--){
                check += m[j][c++];
            }
        }
        
        return check.equals(w);
    }

    public boolean checkDiagUpLeft(String w, int r, int c) {
        String check = "";
        
        if(c - w.length() >= 0 && r - w.length() >= 0){           
            for (int j = r; j > r - w.length(); j--){
                check += m[j][c--];
            }
        }
        return check.equals(w);
    }

    public boolean checkDiagDownLeft(String w, int r, int c) {
        String check = "";
        
        if(c - w.length() >= 0 && r + w.length() <= m.length){           
            for (int j = r; j < r + w.length(); j++){
                check += m[j][c--];
            }
        }
        
        return check.equals(w);
    }

    public boolean checkDiagDownRight(String w, int r, int c) {
        String check = "";
        
        if(c + w.length() <= m[r].length && r + w.length() <= m.length){           
            for (int j = r; j < r + w.length(); j++){
                check += m[j][c++];
            }
        }
        
        return check.equals(w);
    }

    public String toString() {
        String output = "";

        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[r].length; c++) {
                output += m[r][c] + " ";
            }
            output += "\n";
        }

        return output;
    }
}
