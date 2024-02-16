package com.session5;

import java.util.Arrays;

//Write a Java function to reverse a given string. You can use a loop to iterate through the characters
// of the string and construct a new string in reverse order. Return de reversed string.
public class ReverseString {
    public static String reverseStringloop(String word) {
        /*gasim si definim pasi problemei
        0.Definim un string reversed caruia ii dam valoarea cuvantului original (ca ambele sa aibe aceeasi dimensiune)
        1.Trebuie sa facem un loop de tip for
        2.Indexul incepe la 0, conditia de iesire din for este: i<length(word), updateul conditiei i++
        3.laptop -> luam primul caracter din cuvantul original si il plasam pe ultima pozitie din noul cuvant
            word, reversed
            charC = word.charAt(i)
            reversed[length(word)-1-i] = charC
        4.Return la reversed
        */
        char[] reversed = new char[word.length()];
        for(int i=0; i<word.length(); ++i) {
            char charC = word.charAt(i);
            reversed[word.length()-1-i] = charC;
        }
        return String.valueOf(reversed);
    }

    public static void main(String[] args) {
        StringBuilder revStringB = reverseStringB("mihaLL");
        System.out.println(revStringB);
        // Use reverse string method again to get to the original word
        StringBuilder originalB = reverseStringB(revStringB.toString());
        System.out.println(originalB);
        /*System.out.println("----------------------------------------");
        String revString = reverseString("ciocoLATA");
        System.out.println(revString);
        String original = reverseString(revString);
        System.out.println(original);
        System.out.println(new StringBuilder("word").reverse()); // alta optiune (mai directa)
        System.out.println("----------------------------------------");
        String rsl = reverseStringloop("avion");
        System.out.println(rsl);*/
    }

    //Reverse String = returns a StringBuilder
    public static StringBuilder reverseStringB(String word) {
        StringBuilder revString = new StringBuilder(word);
        revString.reverse();
        return revString;
        //System.out.println("Reversed string: " +revString);
    }

    // Modify reverse string to return a string and not a StringBuilder
    public static String reverseString(String word) {
        StringBuilder revString = new StringBuilder(word);
        revString.reverse();
        return revString.toString();
        //System.out.println("Reversed string: " +revString);
    }
}
// Cauta 5 metode interesante in StringBuilder, definestele si folosestele in exemple.