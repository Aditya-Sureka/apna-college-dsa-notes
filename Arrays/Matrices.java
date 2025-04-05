package Arrays;
import java.util.*;

public class Matrices {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1; // 3
        int endCol = matrix[0].length - 1; // 3

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " "); // StartRow -> fixed; j -> variable
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;

        }
        System.out.println();
    }

    // Diagonal Sum problem
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // primary diagonal
            sum += matrix[i][i];
            // secondary diagonal
            if (i != matrix.length - 1 - i)
                sum += matrix[i][matrix.length - i - 1];
        }
        return sum;
    }

    // Search in sorted matrix problem ->
    public static boolean staircaseSearch(int matrix[][], int key) {
        // int row = 0, col = matrix[0].length - 1;
        int row = matrix.length - 1, col = 0;

        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] == key) {
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            }

            else if (key < matrix[row][col]) {
                row--; //Top
            } else {
                col++; //Right
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        int key = 3;
        // printSpiral(matrix);
        staircaseSearch(matrix, key);
    }
}
