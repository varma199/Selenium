package java_Basics;

import java.util.Scanner;

public class Gpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Number of test cases
        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt(); // Number of rows
            int m = scanner.nextInt(); // Number of columns

            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            setZeros(matrix, n, m);

            // Output the modified matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        scanner.close();
    }

    private static void setZeros(int[][] matrix, int n, int m) {
        boolean[] zeroRows = new boolean[n];
        boolean[] zeroCols = new boolean[m];

        // Find rows and columns containing zeros
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // Set zeros in corresponding rows and columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (zeroRows[i] || zeroCols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
	}


