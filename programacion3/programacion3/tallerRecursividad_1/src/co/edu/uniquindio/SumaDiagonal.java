package co.edu.uniquindio;

public class SumaDiagonal {
    public static void main(String[] args) {

        //1. Sumar la diagonal de una matriz de forma recursiva. Retrocediendo en filas y avanzando en columnas

        int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        int sumaDiagonal = sumarDiagonalMatriz(matriz, 0, 0);
        System.out.println(sumaDiagonal);
        System.out.println(matriz.length + ", " + matriz[0].length);

        }

    public static int sumarDiagonalMatriz(int[][] matrix, int i, int j) {
        // Caso base: cuando llegamos al final de la matriz
        if (i == matrix.length || j == matrix[0].length) {
            return 0;
        }
        // Caso recursivo: si estamos en la diagonal, sumamos el valor y avanzamos en diagonal
        if (i == j) {
            return matrix[i][j] + sumarDiagonalMatriz(matrix, i+1, j+1);
        }
        // Caso recursivo: si no estamos en la diagonal, avanzamos en la fila
        return sumarDiagonalMatriz(matrix, i+1, j);


    }
}