package lab0a_syntax_output;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class AsciiBox2 {

    public static void main(String[] args) {
        System.out.println("ElliotMcCormick\t  09/05/2018 \n\n");
        firstAndLastLine();
        for (int i = 0; i <= 3; i++) {
            System.out.println("+++\t\t\t+++ ");
        }
        System.out.println("+++\tCompSci\t\t+++ ");
        for (int i = 0; i <= 3; i++) {
            System.out.println("+++\t\t\t+++ ");
        }
        firstAndLastLine();
    }
    
    public static void firstAndLastLine() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAA ");
        System.out.println("+++++++++++++++++++++++++++ ");

    }
}