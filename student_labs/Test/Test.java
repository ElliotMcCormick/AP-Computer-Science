/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author mccormick.elliot19
 */
public class Test {
    private static int num = 0;
    
    public static void recur(){
        if (num < "Hello World".length()){
            System.out.println("Hello World".charAt(num));
            num++;
            recur();
        }
    }
    
    public static int fun(int x, int y){
        if (y == 2){
            return x;
        } else {
            return fun(x, y - 1) + x;
        }
    }
    
    public static void main(String[] args){
        System.out.println(fun(3, 6));
        recur();
    }
    
}
