package Task04;

import java.util.Scanner;

public class Matrix {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Enter the number of rows for matrix A: ");
                int numRowsA = scanner.nextInt();
                System.out.print("Enter the number of columns for matrix A: ");
                int numColsA = scanner.nextInt();

                System.out.print("Enter the number of rows for matrix B: ");
                int numRowsB = scanner.nextInt();
                System.out.print("Enter the number of columns for matrix B: ");
                int numColsB = scanner.nextInt();

                int[][] matrixA = new int[numRowsA][numColsA];
                int[][] matrixB = new int[numRowsB][numColsB];

                System.out.println("Enter values for matrix A:");
                for (int i = 0; i < numRowsA; i++) {
                    for (int j = 0; j < numColsA; j++) {
                        matrixA[i][j] = scanner.nextInt();
                    }
                }

                System.out.println("Enter values for matrix B:");
                for (int i = 0; i < numRowsB; i++) {
                    for (int j = 0; j < numColsB; j++) {
                        matrixB[i][j] = scanner.nextInt();
                    }
                }

                int[][] result = Main.multiply(matrixA, matrixB);

                System.out.println("Resultant matrix:");
                for (int i = 0; i < result.length; i++) {
                    for (int j = 0; j < result[0].length; j++) {
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
            } catch (IllegalArgumentException e) {
                System.err.println("Matrix multiplication is not possible: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("ERROR: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }


