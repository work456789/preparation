package com.preparation.misc;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisProblem {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        while (true) {
            Scanner input = new Scanner(System.in);
            if (input.nextLine().equals("q")) {
                return;
            }
            testIfCorrect(input.nextLine());
        }

    }

    static boolean testIfCorrect(String input) {
        Stack<Character> charactersStack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char currentStringCharacter = input.charAt(i);

            if (isOpeningBracket(currentStringCharacter)) {
                charactersStack.push(currentStringCharacter);
                continue;
            }

            if (isClosingBracket(currentStringCharacter)) {
                if (charactersStack.isEmpty()) {
                    System.out.println("Not Valid");
                    return false;
                }

                char currentStackCharacter = charactersStack.pop();
                if (!areMatchingBrackets(currentStringCharacter, currentStackCharacter)) {
                    System.out.println("Not Valid");
                    return false;
                }
            }
        }

        if (!charactersStack.isEmpty()) {
            System.out.println("Not Valid");
            return false;
        }

        System.out.println("Valid");
        return true;
    }

    private static boolean areMatchingBrackets(char currentStringCharacter, char currentStackCharacter) {
        if (currentStringCharacter == ')' && currentStackCharacter == '(') {
            return true;
        }

        if (currentStringCharacter == ']' && currentStackCharacter == '[') {
            return true;
        }

        if (currentStringCharacter == '}' && currentStackCharacter == '{') {
            return true;
        }

        return false;
    }

    static boolean isOpeningBracket(Character character) {
        return character == '{' || character == '(' || character == '[';
    }

    static boolean isClosingBracket(Character character) {
        return character == '}' || character == ')' || character == ']';
    }
}
