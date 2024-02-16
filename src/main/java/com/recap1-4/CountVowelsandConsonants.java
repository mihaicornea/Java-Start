package com.session5;

import java.util.Map;
import java.util.HashMap;

/*Recap exercises: PlayTheStrings Class
        1. Count Vowels and Consonants:
        Write a Java function to count the number of vowels and consonants in a given string.
        Consider both uppercase and lowercase letters and returns a dictionary with two keys:
        vowels and the number of vowels, consonants and the number of consonants
 */
public class CountVowelsandConsonants {
    public static void main(String[] args) {
        //am creat metoda main care va fi apelata atunci and rulam clasa
        Map<String, Integer> voco_main = count_VC("aaaaaaaa");
        //folosind structura for each pe un map/dictionar
        for (Map.Entry<String, Integer> entry : voco_main.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map <String, Integer> count_VC(String word) {
        Map<String, Integer> voco = new HashMap<>();
        word = word.toLowerCase();  // suprascriem variabila word cu litere mici
        int number_vowels = 0;      // counter vowels
        int number_cons = 0;        // counter cons

        //word = "apa" => 2v , 1c
        //cum facem rost de cate un caracter pe rand din cuvantul word
        //folosim o structura iterativa for care sa analizeze pe rand fiecare caracter folosindune de un indice
        for (int i = 0; i < word.length(); i++) {
            //analizam fiecare caracter pentru a face diferenta intre v si c
            char character = word.charAt(i);
            //in functie de caracter incrementam number_vowels sau number_cons
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                //number_vowels = number_vowels+1;
                //number_vowels += 1;
                number_vowels++;
            } else {
                number_cons++;
            }
        }
        voco.put("vowels", number_vowels);
        voco.put("cons", number_cons);
        return voco;
    }
        //creeam functia countV_C care primeste un string si printeaza pe ecran numarul de vocale si consoane
    public static void countV_C(String word) {
        word = word.toLowerCase();  // suprascriem variabila word cu litere mici
        int number_vowels = 0;      // counter vowels
        int number_cons = 0;        // counter cons

        //word = "apa" => 2v , 1c
        //cum facem rost de cate un caracter pe rand din cuvantul word
        //folosim o structura iterativa for care sa analizeze pe rand fiecare caracter folosindune de un indice
        for (int i = 0; i < word.length(); i++) {
            //analizam fiecare caracter pentru a face diferenta intre v si c
            char character = word.charAt(i);
            //in functie de caracter incrementam number_vowels sau number_cons
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                //number_vowels = number_vowels+1;
                //number_vowels += 1;
                number_vowels++;
            } else {
                number_cons++;
            }
        }
        System.out.println("Number of vowels: " + number_vowels);
        System.out.println("Number of cons: " + number_cons);
    }
}
