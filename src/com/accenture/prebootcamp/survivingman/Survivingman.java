
package com.accenture.prebootcamp.survivingman;

import java.awt.*;
import java.util.Scanner;

import static com.accenture.prebootcamp.survivingman.Graphics.*;

public class Survivingman {
    private static String[] words = {"fire", "silver", "java", "thanks", "dream", "knowledge", "magic",
            "pizza", "chicken", "nightmare", "computer", "facebook", "strength", "fear", "safety", "holiday",
            "human", "tasty", "chocolate", "tiger", "explore", "hide", "jungle", "shelter"};
    private static String word;
    private static String dashes;
    private static int countWrong;
    private static int countRight;
    private static int timesRepeatGame = 5;

    public static void main(String[] args) {

        do {
            startGame();
            System.out.println();
            System.out.println("\n" +
                    "    __          __  _                 __                                      _         __\n" +
                    "   / /   ___   / /_( )_____   ____   / /____ _ __  __   ____ _ ____ _ ____ _ (_)____   / /\n" +
                    "  / /   / _ \\ / __/|// ___/  / __ \\ / // __ `// / / /  / __ `// __ `// __ `// // __ \\ / / \n" +
                    " / /___/  __// /_   (__  )  / /_/ // // /_/ // /_/ /  / /_/ // /_/ // /_/ // // / / //_/  \n" +
                    "/_____/\\___/ \\__/  /____/  / .___//_/ \\__,_/ \\__, /   \\__,_/ \\__, / \\__,_//_//_/ /_/(_)   \n" +
                    "                          /_/               /____/          /____/                        \n");
            System.out.println("________________________________________________________________________________________________________________________________________");

        } while (--timesRepeatGame > 0);
    }

    public static void startGame() {
        word = words[(int) (Math.random() * words.length)];
        dashes = new String(new char[word.length()]).replace("\0", "_");
        countWrong = countRight = 0;
        if (timesRepeatGame == 5) {

            System.out.println();

            System.out.println("    SSSS    UU      UU   RR RR     VV      VV   II   VV      VV   II   NN     NN     GG GG GG    M         M        A        NN      NN ");
            System.out.println("  SSS       UU      UU   RR   RR    VV    VV    II    VV    VV    II   NNNN   NN    GG           MMM     MMM      AA AA      NNNN    NN ");
            System.out.println("    SSS     UU      UU   RR RR       VV  VV     II     VV  VV     II   NN NN  NN   GG     GGG    MM M   M MM     AA   AA     NN  NN  NN ");
            System.out.println("      SSS    UU    UU    RR  RR       VVVV      II      VVVV      II   NN   NNNN    GG      GG   MM  M M  MM    AA AAA AA    NN    NNNN ");
            System.out.println("   SSSS        UUUU      RR   RR       VV       II       VV       II   NN     NN     GG GG GG    MM   M   MM   AA       AA   NN      NN ");

            System.out.println();

            System.out.println("The first thing you see when you open your eyes is a bright light. Your head feels hazy and your body- heavy.\n" +
                    "You were on your way to fly to see your family, but the last thing you remember is the pilot yelling that the plane is about to crash.\n" +
                    "Strangely, there is no one else around you, but you know that you have been laying there for a while as your mouth is dry and the plane\n" +
                    "isn't burning anymore, there are just smoke coming from the shattered metal parts.\n" +
                    "Your thoughts are disturbed by the sound of branches breaking under someone's feet.\n" +
                    "You hide behind a plane wing and see a tribe coming in your direction.\n" +
                    "They don't look friendly, with spears in their hands and their faces painted red and black.\n" +
                    "You remember reading in a facebook post, that your crazy aunt posted, about tribes that paint their faces this way and\n" +
                    "eat human flesh of lost travellers unless...\n" +
                    "Unless you tell them the magic word... what was the magic word?");

            System.out.println();
        }
        Scanner sc = new Scanner(System.in);

        while (countWrong < 7 && dashes.contains("_")) {
            System.out.println("Try to remember a letter from the magic word");
            System.out.println(dashes);
            String guess = sc.nextLine();
            guess = guess.toLowerCase();
            if (guess.matches("[1234567890]")) {
                System.out.println("Please insert a letter");
                sc.next();
            }
            action(guess);
        }
    }

    public static void action(String guess) {
        String newdashes = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newdashes += guess.charAt(0);
            } else if (dashes.charAt(i) != '_') {
                newdashes += word.charAt(i);
            } else {
                newdashes += "_";
            }
        }

        if (dashes.equals(newdashes)) {
            countWrong++;
            wrongAnswer();
        } else {
            dashes = newdashes;
            countRight++;
            rightAnswer();
        }
        if (dashes.equals(word)) {
            System.out.println(word + "!!! You guessed the word! Yay! It was " + word + "! And right when the tribe had found you while you were taking a nap.\n" +
                    "You tell them the word and they take you to the nearest village where you meet people\n" +
                    "who are just about to fly to the same place you were going! You're the happiest person on earth...\n" +
                    "And then you wake up. It was all a dream.");
            winner();
        }
    }

    public static void rightAnswer() {
        if (countRight == 1) {
            countRight1();
        }
        if (countRight == 2) {
            countRight2();
        }
        if (countRight == 3) {
            countRight3();
        }
        if (countRight == 4) {
            countRight4();
        }
        if (countRight == 5) {
            countRight5();
        }
        if (countRight == 6) {
            countRight6();
        }
        if (countRight == 7) {
            countRight7();
        }
        if (countRight == 8) {
            countRight8();
        }
        if (countRight == 9) {
            countRight9();
        }
    }

    public static void wrongAnswer() {

        if (countWrong == 1) {
            countWrong1();
        }
        if (countWrong == 2) {
            countWrong2();
        }
        if (countWrong == 3) {
            countWrong3();
        }
        if (countWrong == 4) {
            countWrong4();
        }
        if (countWrong == 5) {
            countWrong5();
        }
        if (countWrong == 6) {
            countWrong6();
        }
        if (countWrong == 7) {
            countWrong7();
        }
    }
}



