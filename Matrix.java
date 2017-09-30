import java.util.Random;

public class Matrix {

    public static int[][] createMatrix(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0 + (int) (Math.random() * ((9 - 0) + 1));
            }
        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = createMatrix(5);
        print(matrix);
        System.out.println("_________________________");
        print(transp(matrix));
    }

    public static int[][] transp(int[][] matrix) {
        int[][] rez = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                rez[j][i] = matrix[i][j];
            }
        }
        return rez;
    }
}

