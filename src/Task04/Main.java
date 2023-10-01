package Task04;

import java.util.Scanner;

public class Main {
        public static int[][] multiply(int[][] matrixA, int[][] matrixB) throws IllegalArgumentException {
            int numRowsA = matrixA.length;
            int numColsA = matrixA[0].length;
            int numRowsB = matrixB.length;
            int numColsB = matrixB[0].length;

            if (numColsA != numRowsB) {
                throw new IllegalArgumentException("The number of columns in matrixA must be equal to the number of rows in matrixB");
            }

            int[][] result = new int[numRowsA][numColsB];

            for (int i = 0; i < numRowsA; i++) {
                for (int j = 0; j < numColsB; j++) {
                    int sum = 0;
                    for (int k = 0; k < numColsA; k++) {
                        sum += matrixA[i][k] * matrixB[k][j];
                    }
                    result[i][j] = sum;
                }
            }

            return result;
        }
    }
