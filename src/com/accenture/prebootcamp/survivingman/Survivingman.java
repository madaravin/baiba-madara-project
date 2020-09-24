
package com.accenture.prebootcamp.survivingman;

import java.util.Scanner;

public class Survivingman {
    private static String[] words = {"fire", "silver", "java", "thanks", "dream", "knowledge", "magic",
            "pizza", "chicken", "nightmare", "computer", "facebook", "strength", "fear", "safety", "holiday",
            "human", "tasty", "chocolate", "tiger", "explore", "hide", "jungle", "shelter"};
    private static String word;
    private static String dashes;
    private static int countWrong;
    private static int countRight;

    public static void main(String[] args) {
        int timesRepeatGame = 5;
        do {
            startGame();
        } while (--timesRepeatGame > 0);
    }
    public static void startGame() {
        word = words[(int) (Math.random() * words.length)];
        dashes = new String(new char[word.length()]).replace("\0", "_");
        countWrong = countRight = 0;

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
                "You remember reading in a facebook post, that your crazy aunt posted, about tribes that paint their faces this way\n" +
                "eat human flesh of lost travellers unless...\n" +
                "Unless you tell them the magic word... what was the magic word?");

        System.out.println();

        Scanner sc = new Scanner(System.in);

        while (countWrong < 7 && dashes.contains("_")) {
            System.out.println("Try to remember a letter from the magic word");
            System.out.println(dashes);
            String guess = sc.next();
            action(guess);
        }
        sc.close();
    }


            public static void action (String guess){
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
                    System.out.println(word+ "!!! You guessed the word! Yay! It was " + word + "! And right when the tribe had found you while you were taking a nap.\n" +
                            "You tell them the word and they take you to the nearest village where you meet people\n" +
                            "who are just about to fly to the same place you were going! You're the happiest person on earth...\n" +
                            "And then you wake up. It was all a dream.");
                }
            }
            public static void rightAnswer () {
                if (countRight == 1) {
                    System.out.println("You guessed right! You just found a water source and now you're hydrated.");
                    System.out.println("        .                 ");
                    System.out.println("      |^ .                ");
                    System.out.println("    \\O___.____ /         ");
                    System.out.println("      \\   .  /           ");
                    System.out.println("        \\ ,/             ");
                    System.out.println("         []               ");
                    System.out.println("         []               ");
                    System.out.println("         []               ");
                    System.out.println("      ========            ");
                    System.out.println();
                }
                if (countRight == 2) {
                    System.out.println("You guessed right! While hiding from the tribe, you meet a shaman who shared his warm campfire.\n" +
                            " He gave you a blessing for the way forward.");
                    System.out.println();
                }
                if (countRight == 3) {
                    System.out.println("You guessed right! It's getting dark outside, so it is time to build a wigwam to sleep in.\n" +
                            " With few branches, large leaves and a pilots jacket you made a cozy shelter.\n" +
                            "In your mind you thought you might be a good interior designer.");
                    System.out.println();
                }
                if (countRight == 4) {
                    System.out.println("You guessed right! You were hungry, so you catch a frog. You made some french crispy frog leg delicacies.");
                    System.out.println("           _ _         ");
                    System.out.println("         (.)_(.)       ");
                    System.out.println("      _ (   _   ) _       ");
                    System.out.println("     / \\/`-----'\\/ \\   ");
                    System.out.println("   __\\ ( (     ) ) /__     ");
                    System.out.println("  )   / \\ \\._./ / \\   (   ");
                    System.out.println("   )_/  /|\\    /|\\ \\_(    ");
                    System.out.println();
                }
                if (countRight == 5) {
                    System.out.println("You guessed right! You had the idea to disguise yourself so that the tribe wouldn't notice you so easily.\n" +
                            "With some mud you made yourself invisible.");
                    System.out.println();
                }
                if (countRight == 6) {
                    System.out.println("You guessed right! You found a knife that someone must have lost. " +
                            "Now you can make spears, catch fish and peel apples. you don't like eating apples with the peel on.");
                    System.out.println();
                }
                if (countRight == 7) {
                    System.out.println("You guessed right! You found a medical plant to heal your injuries. Another small victory.\"");
                    System.out.println();
                }
                if (countRight == 8) {
                    System.out.println("You guessed right! While sneaking in the jungle, you spot a young tigress and you feed her some of your " +
                            "food so she doesn't attack you. At first, she scratches you a bit, " +
                            "but after seeing you have food, she gets used to you quickly and now you have a pet!");
                    System.out.println();
                }
                if (countRight == 9) {
                    System.out.println("You guessed right! How does it feel to be a winner?");
                    System.out.println();
                }
            }

            public static void wrongAnswer () {
                if (countWrong == 1) {
                    System.out.println("Wrong guess! While hiding from the tribe, you got very cold so you decided to light a campfire.\n" +
                            " You saw how to do it on television, so you rubbed the stones together for three hours straight for no reason.");
                    System.out.println();
                }
                if (countWrong == 2) {
                    System.out.println("Wrong guess! You ate some poisonous berries by accident and now you're feeling sick.");
                    System.out.println();
                }
                if (countWrong == 3) {
                    System.out.println("Wrong guess! Where to sleep, you thought. My father always told me I'm not a good builder.\n" +
                            "So you find a cave which made you run for your life, because the bear wasn't waiting for any guests.");
                    System.out.println();
                }
                if (countWrong == 4) {
                    System.out.println("Wrong guess! You were hungry, so you catch a colorful frog.\n" +
                            "You ate it, it tasted terrible and you felt quite strange.It made you hallucinate all day long.");
                    System.out.println("       ____  __.---\"\"---.__  ____");
                    System.out.println("      /####\\/              \\/####\\");
                    System.out.println("     (  / \\ )             ( / \\  )");
                    System.out.println("     \\____/                \\____/");
                    System.out.println("    __/                          \\__");
                    System.out.println(" .-\"    .                      .    \"-.");
                    System.out.println(" |  |   \\.._                _../   |  |");
                    System.out.println("  \\  \\    \\.\"-.__________.-\"./    /  /");
                    System.out.println("    \\  \\    \"--.________.--\"    /  /");
                    System.out.println("  ___\\  \\_                    _/  /___");
                    System.out.println("./    )))))                  (((((    \\.");
                    System.out.println("\\                                      /");
                    System.out.println(" \\           \\_          _/           /");
                    System.out.println("   \\    \\____/\"\"-.____.-\"\"\\____/    /");
                    System.out.println("     \\    \\                  /    /");
                    System.out.println("      \\.  .|                |.  ./");
                    System.out.println("    .\" / |  \\              /  | \\  \".");
                    System.out.println(" .\"  /   |   \\            /   |   \\   \".");
                    System.out.println("/.-./.--.|.--.\\          /.--.|.--.\\.-.| ");
                    System.out.println();
                }
                if (countWrong == 5) {
                    System.out.println("Wrong guess! You had the idea to disguise yourself so that the tribe wouldn't notice you so easily.\n" +
                            "With some mud you made yourself look like you came out from some unsuccessful chocolate spa treatment.\n" +
                            "Even jungle creatures look at you with condemnation.");
                    System.out.println();
                }
                if (countWrong == 6) {
                    System.out.println("Wrong guess! While sneaking in the jungle, suddenly you get attacked by a panther.\n" +
                            "It only injures your arm and then leaves you since you smell bad.");
                    System.out.println();
                }
                if (countWrong == 7) {
                    System.out.println("Wrong guess! You are awoken from your nap as the tribe has their spears pointed towards you.\n" +
                            "You have no escape and you start to think about the impending doom.\n" +
                            "They bring you to their village, where they have prepared a large pot for you to boil in and\n" +
                            "they will make a delicious borsch from you. While your screaming for your life,\n" +
                            "you suddenly wake up in your bed, at home.\n " +
                            "It was all just a nightmare and you decide to never read facebook articles again. ");
                }
            }
}



