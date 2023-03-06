package co.edu.uniquindio;

public class SumaDiagonal {
    public static void main(String[] args) {


        //Sumar la diagonal de una matriz de forma recursiva. Retrocediendo en filas y avanzando en columnas
        int [][] matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int sumaDiagonal = sumarDiagonal(matriz, matriz.length-1, 0);
        System.out.println("Suma diagonal: " + sumaDiagonal);

    }


    public static int sumarDiagonal(int[][] matriz, int i, int j) {
        //Se evalua que i == j para confirmar que la posición se encuentra en la diagonal principal
      if(i==j){
                //En caso de que se encuentre en la diagonal, se suma el valor y se hace el llamado recursivo
                // retrocediendo en las filas
              return (matriz[i][j] + sumarDiagonal(matriz, i-1, j));

      }else{
            //Si las columnas exceden el rango, se hace llamado recursivo y se reinicia posición en j
          if(i>=0 && j>matriz[i].length-1){

              return sumarDiagonal(matriz, i, 0);

          }else {
                //Si la posición no corresponde a la diagonal, y aún está dentro del rango, se avanza en columnas
              if((i>=0 && j<=matriz[i].length-1)){

                return sumarDiagonal(matriz, i, j+1);

                }else{
                    //Si ya se recorrieron todas las posiciones se retorna cero para no sumar ningún valor
                  return 0;

              }
          }

      }


    }


}