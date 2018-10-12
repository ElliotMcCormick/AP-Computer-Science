package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TwoToTen {

    private String binary;

    public TwoToTen() {
        setTwo("");
    }

    public TwoToTen(String bin) {
        setTwo(bin);
    }

    public void setTwo(String bin) {
        binary = bin;
    }

    public long getBaseTen() {
        long ten = 0;
        for (int i = 0; i < binary.length(); i++){
            if (binary.charAt(binary.length() - 1 - i) == '1'){
                ten += Math.pow(2, i);
            } else {
                ten += 0;
            }
        }
        return ten;
    }

    public String toString() {
        return binary + " == " + getBaseTen();
    }
}