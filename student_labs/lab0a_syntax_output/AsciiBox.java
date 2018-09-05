package lab0a_syntax_output;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class AsciiBox {

    public static void main(String[] args) {
        System.out.println("Elliot McCormick \t  09/04/2018 \n\n");
        
        for (int i = 0; i <=2; i++){
            for (int a = 0; a <= 2; a++){
                System.out.println("++++++++++++++++++++++++ ");
            }
            for (int b = 0; b <=1; b++){
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAA ");
            }
        }
        
        for (int a = 0; a <= 2; a++){
            System.out.println("++++++++++++++++++++++++ ");
        }

    }
}