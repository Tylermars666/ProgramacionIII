package co.edu.uniquindio;

public class SumaDiagonal {
    public static void main(String[] args) {

        //1. Sumar la diagonal de una matriz de forma recursiva. Avanzando en filas y columnas

        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sumaDiagonalPrincipal = sumarDiagonalPrincipal(matriz, 0, 0);
        System.out.println("Suma principal: " + sumaDiagonalPrincipal);

        //Sumar la diagonal de una matriz de forma recursiva. Retrocediendo en filas y avanzando en columnas
        int sumaDiagonalSecundaria = sumarDiagonalSecundaria(matriz, matriz.length-1, 0);
        System.out.println("Suma secundaria: " + sumaDiagonalSecundaria);

    }

    public static int sumarDiagonalPrincipal(int[][] matrix, int i, int j) {
        // Caso base: cuando llegamos al final de la matriz
        if (i == matrix.length || j == matrix[0].length) {
            return 0;
        }
        // Caso recursivo: si estamos en la diagonal, sumamos el valor y avanzamos en diagonal
        if (i == j) {
            return matrix[i][j] + sumarDiagonalPrincipal(matrix, i + 1, j + 1);
        }
        // Caso recursivo: si no estamos en la diagonal, avanzamos en la fila
        return sumarDiagonalPrincipal(matrix, i + 1, j);


    }

    public static int sumarDiagonalSecundaria(int[][] matrix, int i, int j) {
        // Caso base: cuando llegamos al final de la matriz
        if (i < 0 || j == matrix[0].length) {
            return 0;
        }
        // Caso recursivo: si estamos en la diagonal secundaria, sumamos y restamos para avanzar
        if ((i + j) == matrix.length-1) {
            return matrix[i][j] + sumarDiagonalSecundaria(matrix, i - 1, j + 1);
        }
        // Caso recursivo: si no estamos en la diagonal, retrocedemos en la fila
        return sumarDiagonalSecundaria(matrix, i - 1, j);


    }
}