
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
            playAgain();
        } while (--timesRepeatGame > 0);
    }

    public static void startGame() {
        word = words[(int) (Math.random() * words.length)];
        dashes = new String(new char[word.length()]).replace("\0", "_");
        countWrong = countRight = 0;
        if (timesRepeatGame == 5) {
            title();
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
            if (guess.contains("\\d")) {
                System.out.println("Please insert a letter!");
            }
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



