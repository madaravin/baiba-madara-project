# baiba-madara-project
Surviving man for "She goes tech"

    How to play "Surviving Man"?

    The game will take place between player and computer.
    The computer will randomly pick one word or phrase, and player will try to guess what it is one letter at a time.
    The computer outputs a number of dashes equivalent to the number of letters in the word.
    If a guessing player suggests a letter that occurs in the word, the computer fills in the blanks with that letter in the right places.
    If the word does not contain the suggested letter, the computer warns that surviving man is approaching the danger of death.
    As the game progresses, computer keeps adding danger for every suggested letter not in the word.
    The number of incorrect guesses before the game ends is 7. If the player guesses the given word correctly, then surviving man is saved and we can congratulate player on the victory.


    What "Surviving Man" program does?

    From the very beginning, we create an String array with an indefinite number of words that the user will try to guess.
    With the random math method, we allow the computer to pick a word through existing array. We use replace method on new String to hide each letter from word under the dashes.
    It is necessary to create integer that counts form 0 to 7 (that is how much times player can guess). We need to import Scanner class for user to enter their guess.
    While number of count is lower than 7 ,using method, we keep asking player to guess the right letter in the word.
    Next we loop through the word to compare each letter with players entered guess. If the players entered letter does not match we keep hiding the word.
    By every count and it will show up by every guess, we add a image and we print out story (text) with the current situation of the surviving man.
    Player wins the game if count is lower the 7 and the guess equals to given word. We can congratulate the player.
    After first round, player has a chance to play "Surviving Man" again.

    Examples:
    The player needs to guess word orange.
        Example input:
                A
        Example output:
                "You guessed right! You just found a water source and now you're hydrated."
                The program also outputs an image of the surviving man

        Example input:
                B
        Example output:
        "Wrong guess! You ate some poisonous berries by accident and now you're feeling sick."
         The program also outputs an image of the surviving man, who looks sick.

