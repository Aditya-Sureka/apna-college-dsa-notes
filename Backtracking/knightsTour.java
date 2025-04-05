// package Backtracking;

// public class knightsTour {
//     static int N = 8;

//     public static boolean isSafe(int x, int y, int sol[][]) {
//         return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
//     }

//     public static void printSolution(int sol[][]) {
//         for (int x = 0; x < N; x++) {
//             for (int y = 0; y < N; y++)
//                 System.out.print(sol[x][y] + " ");
//             System.out.println();
//         }
//     }

//     public static boolean solveKT() {
//         int sol[][] = new int[8][8];
//         for (int x = 0; x < N; x++)
//             for (int y = 0; y < N; y++)
//                 sol[x][y] = -1;

//         int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
//         int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

//         // As the knight starts from cell(0,0)
//         sol[0][0] = 0;

//         if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
//             System.out.println("Soluton does not exist");
//             return false;
//         } else
//             printSolution(sol);
//         return true;
//     }

//     public static boolean solveKTUtil(int x, int y, int movei, int sol[][], int xMove[], int yMove[]) {
//         int k, next_x, next_y;
//         if (movei == N * N)
//             return true;
//         for (k = 0; k < 8; k++) {
//             next_x = x + xMove[k];
//             next_y = y + yMove[k];
//             if (isSafe(next_x, next_y, sol)) {
//                 sol[next_x][next_y] = movei;
//                 if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove))
//                     return true;
//                 else
//                     sol[next_x][next_y] = -1; // backtracking
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         solveKT();
//     }
// }

package Backtracking;

public class knightsTour {

    static int dr[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
    static int dc[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

    public static boolean knightTour(int row, int col, int move, int[][] chess) {
        if (move == 64) {
            for (int r = 0; r < 8; r++) {
                for (int c = 0; c < 8; c++) {
                    System.out.print(chess[r][c] + " ");
                }
                System.out.println();
            }
            return true;
        }
        if (row < 0 || col < 0 || row >= 8 || col >= 8)
            return false;
        if (chess[row][col] != -1)
            return false;

        chess[row][col] = move;

        for (int choice = 0; choice < 8; choice++) {
            int newRow = row + dr[choice];
            int newCol = col + dc[choice];

            boolean res = knightTour(newRow, newCol, move + 1, chess);
            if (res == true)
                return res;
        }
        chess[row][col] = -1; //backtarcking
        return false;
    }

    public static void main(String[] args) {
        int srcRow = 0, srcCol = 0;
        int[][] chess = new int[8][8];
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                chess[r][c] = -1;
            }
        }
        knightTour(srcRow, srcCol, 0, chess);
    }
}