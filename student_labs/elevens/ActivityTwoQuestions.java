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

/*
1. Explain in your own words the relationship between a deck and a card.
    - A deck creates a list of cards. A deck is composed of a collection of cards

2. Consider the deck initialized with the statements below. How many cards does the deck contain?
String[] ranks = {"jack", "queen", "king"};
String[] suits = {"blue", "red"};
int[] pointValues = {11, 12, 13};
Deck d = new Deck(ranks, suits, pointValues);
    -The deck contains 6 cards

3. The game of Twenty-One is played with a deck of 52 cards. Ranks run from ace (highest) down to 2
(lowest). Suits are spades, hearts, diamonds, and clubs as in many other games. A face card has point
value 10; an ace has point value 11; point values for 2, ..., 10 are 2, ..., 10, respectively. Specify the
contents of the ranks, suits, and pointValues arrays so that the statement
Deck d = new Deck(ranks, suits, pointValues);
initializes a deck for a Twenty-One game.
    - String[] ranks = {"ace", "king", "queen", "jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
    - String[] suits = {"spades", "hearts", "diamonds", "clubs"};
    - int[] pointValues = {11, 10, 10, 10, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2};

4. Does the order of elements of the ranks, suits, and pointValues arrays matter?
    - The pointValues have to align with the ranks of the cards. The suits can be in any order. 
*/
