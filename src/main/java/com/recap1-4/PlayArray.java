package com.session5;

/*PlayArray class
4. Find Maximum and Minimum:
Write a Java function to find the maximum and minimum values in an array of integers.
Returns an array with two elements: maximum and minimum

5. Array Sum and Average: Create a Java function to calculate the sum and average of elements in an array of numbers.
Returns an array with two elements: first is the sum, the second is the average

6. Remove Duplicates: Write a Java function to remove duplicate elements from an array,
returns an array without the duplicates, hint review sets
Print the initial array and the array without duplicates
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PlayArray {
    public static void main(String[] args) {
        int[] myNewNumbers = {1, 2, 3, 4, 5, 0, 1, 2, 3};
        //                    0,1,2,3,4,5 ,6, 7  ,8  ,9
        int[] maxAndMin = calcMaxMin(myNewNumbers);
        //Opt1 Folosim un for each ca sa printam maxim si minim
        for (int num : maxAndMin) {
            System.out.println("Max and Min: " + num);
        }
        System.out.println("-------------------------------------");
        //Opt2 Printam valoare maxima si valoarea minima
        System.out.println("Maximum value: " + maxAndMin[0]);
        System.out.println("Minimum value: " + maxAndMin[1]);
        System.out.println("-------------------------------------");
        double[] sumAndAvg = arraySumAndAvg(myNewNumbers);
        System.out.println("Sum: " + sumAndAvg[0]);
        System.out.println("Avg: " + sumAndAvg[1]);
        System.out.println("-------------------------------------");
        System.out.println(Arrays.toString(myNewNumbers));
        int[] remDup = removeDup(myNewNumbers);
        for (int num : remDup) {
            System.out.print(num);
        }

    }

    private static int[] calcMaxMin(int[] numbers) {
        //Cum gasim numarul max si min in array-ul de numbers
        //Stabilim variabila maxim avand prima valoare din array
        int maxim = numbers[0];
        int minim = numbers[0];
        for (int i = 0; i < numbers.length; ++i) {
            //Comparam elementul de pe fiecare pozitie cu numarul maxim si actualizam valoarea cu maximul gasit
            if (numbers[i] > maxim) {
                maxim = numbers[i];
            }
            //Comparam elementul de pe fiecare pozitie cu numarul minim si actualizam valoarea cu minimul gasit
            if (numbers[i] < minim) {
                minim = numbers[i];
            }
        }
        //Costruim un array de tip int cu valorile obtinute din maxim si minim si il returnam
        int[] result = {maxim, minim};
        return result;
    }

    /*5. Array Sum and Average: Create a Java function to calculate the sum and average of elements in an array of numbers.
    Returns an array with two elements: first is the sum, the second is the average
    Pentru formatare automata apasati CTRL+ALT+L
    */
    public static double[] arraySumAndAvg(int[] numbers) {
        //Adunam fiecare element pentru a afla suma
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < numbers.length; ++i) {
            sum = sum + numbers[i];
        }
        //AVG = suma elementelor impartite la numarul lor
        //AVG = sum / numbers.length
        avg = (double) sum / numbers.length;
        //System.out.println(sum);
        //System.out.println(avg);
        double[] resultSumAvg = {sum, avg};
        return resultSumAvg;
    }

    /*6. Remove Duplicates: Write a Java function to remove duplicate elements from an array,
returns an array without the duplicates, hint review sets
Print the initial array and the array without duplicates

Create an empty set,
apoi adaugam in set fiecare element din array, in acest proces scapam de duplicate pentru ca se va
adauga fiecare element doar o singura data.
apoi parcurgem noul set si
contruim un nou array, de dimensiunea setului,
si adaugam in array tot ce avem in set,
apoi returnam noul array, care nu mai contine duplicate*/
    public static int[] removeDup(int[] numbers) {
        Set<Integer> numbersSet = new HashSet<>();
        for (int element : numbers) {
            numbersSet.add(element);
        }
        int[] uniqueNumbers = new int[numbersSet.size()];
        int i=0;
        for (int element : numbersSet) {
            uniqueNumbers[i] = element;
            ++i;
        }
//        for (int element : numbers) {
//            System.out.print(element);
//        }
//        System.out.println("_______________________");
//        for (int element : numbersSet) {
//            System.out.print(element);
//        }
        return uniqueNumbers;
    }
}
