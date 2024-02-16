package com.session5;

import java.util.Locale;
import java.util.Objects;

/*Create a Java function to check if a given string is a palindrome (reads the same backward as forward).
Ignore spaces, punctuation, and capitalisation.
Returns true when the attribute given is a palindrome, returns false otherwise
pap
naman
A man, a plan, a canal, Panama */
public class Palindrome {
    public static void main(String[] args) {
        //checkWord("apaz");
        //checkPali("namaN");
        boolean printPali = checkPali("naMaN");
        System.out.println(printPali);
    }
    public static String reverseWord (String word) {
        StringBuilder checkW = new StringBuilder();
        word = word.toLowerCase(Locale.ROOT);
        checkW.append(word);
        checkW.reverse();
        //System.out.println(checkW);
        return String.valueOf(checkW);

    }
    public static boolean checkPali (String word) {
        boolean isPali = false;
        String revW = reverseWord(word);
        word = word.toLowerCase(Locale.ROOT);
        //System.out.println(revW + "  " + word);
        if(Objects.equals(revW, word)) {
            isPali = true;
        }
        return isPali;
    }
}
