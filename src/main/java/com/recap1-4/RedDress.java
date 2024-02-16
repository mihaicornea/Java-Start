package com.session5;

import java.util.Date;
import java.util.Scanner;

/*
* 8. Matrix Addition: Write a Java program to add two matrices. The program should prompt the user to enter the
* elements of the two matrices, perform the addition, and then display the result.
*9. Matrix diagonal: The program should prompt the user to enter the elements of the matrix and
* return an array with the elements of the diagonal
* (diagonala stanga sus - dreapta jos)
*10. Transpose the elements of a matrix, the rows become columns and the columns become rows.
* */
import java.util.Scanner;

public class RedDress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the dimensions of the matrices
        System.out.print("Enter the number of rows for matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for matrices: ");
        int cols = scanner.nextInt();

        // Initialize matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        // Input elements for matrix 1
        System.out.println("Enter elements for matrix 1:");
        inputMatrixElements(matrix1, scanner);

        // Input elements for matrix 2
        System.out.println("Enter elements for matrix 2:");
        inputMatrixElements(matrix2, scanner);

        // Display matrix 1
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        // Display matrix 2
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        // Perform matrix addition
        int[][] resultMatrix = addMatrices(matrix1, matrix2);

        // Display the result of matrix addition
        System.out.println("Result of Matrix Addition:");
        displayMatrix(resultMatrix);

        // Transpose the result matrix
        int[][] transposedMatrix = transposeMatrix(resultMatrix);

        // Display the transposed matrix
        System.out.println("Transposed Matrix:");
        displayMatrix(transposedMatrix);
    }

    // Function to input matrix elements
    private static void inputMatrixElements(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Function to display matrix
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Function to add two matrices
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    // Function to transpose a matrix
    private static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }
}

