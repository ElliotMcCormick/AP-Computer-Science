/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevens;

/**
 *
 * @author elliot
 */
public class DeckTester {
    public static void main(String[] args){
        
        String[] ranks = {"jack", "queen", "king"};
        String[] suits = {"blue", "red"};
        int[] pointValues = {11, 12, 13};
        Deck one = new Deck(ranks, suits, pointValues);

        System.out.println(one.isEmpty());
        System.out.println(one.size());
        System.out.println(one.deal());
        System.out.println(one.deal());
        System.out.println(one.deal());
        System.out.println(one);
        
        ranks = new String[] {"ace", "king", "queen", "jack", "ten"};
        suits = new String[] {"spades", "hearts", "diamonds", "clubs"};
        pointValues = new int [] {1, 1, 1, 1, 1};
        Deck two = new Deck(ranks, suits, pointValues);
        
        System.out.println(two.isEmpty());
        System.out.println(two.size());
        System.out.println(two.deal());
        System.out.println(two.deal());
        System.out.println(two.deal());
        System.out.println(two);
        
        ranks = new String[] {"1", "2", "3", "4", "5"};
        suits = new String[] {"q", "r"};
        pointValues = new int [] {1, 1, 1, 1, 1};
        Deck three = new Deck(ranks, suits, pointValues);
        
        System.out.println(three.isEmpty());
        System.out.println(three.size());
        System.out.println(three.deal());
        System.out.println(three.deal());
        System.out.println(three.deal());
        System.out.println(three.deal());
        System.out.println(three.deal());
        System.out.println(three.deal());
        System.out.println(three.deal());
        System.out.println(three.deal());
        System.out.println(three.deal());
        System.out.println(three.deal());
        System.out.println(three.deal());
        System.out.println(three.deal());
        System.out.println(three);
        
        
        ranks = new String[] {"ace", "king", "queen", "jack", "ten"};
        suits = new String[] {"spades", "hearts", "diamonds", "clubs"};
        pointValues = new int [] {1, 1, 1, 1, 1};
        Deck four = new Deck(ranks, suits, pointValues);
        
        System.out.println(four);
        four.shuffle();
        System.out.println(four);
    }
}
