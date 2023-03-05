package co.edu.uniquindio;

public class SumaDiagonal {
    public static void main(String[] args) {


        //Sumar la diagonal de una matriz de forma recursiva. Retrocediendo en filas y avanzando en columnas
        int [][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sumaDiagonal = sumarDiagonal(matriz, matriz.length-1, 0);
        System.out.println("Suma diagonal: " + sumaDiagonal);

    }


    public static int sumarDiagonal(int[][] matrix, int i, int j) {

      if(i==j){

              return (matrix[i][j] + sumarDiagonal(matrix, i-1, j));

      }else{

          if(i>=0 && j>matrix[i].length-1){

              return sumarDiagonal(matrix, i, 0);

          }else {

              if((i>=0 && j<=matrix[i].length-1)){

                return sumarDiagonal(matrix, i, j+1);

                }else{

                  return 0;

              }
          }

      }


    }


}