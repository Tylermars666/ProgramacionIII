package co.edu.uniquindio;


/**
 * @Author: Omar Piedrahita - Carlos Mancera
 */
public class SumaMatriz {

    public static void main( String [] args){

        //3. Suma de una matriz de forma recursiva. Retrocediendo en filas y columnas

        int [][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        int sumaMatriz = sumarMatriz(matriz, matriz.length-1, matriz[0].length-1);
        System.out.println("Esta es la suma: " + sumaMatriz);
        }



        public static int sumarMatriz(int [][] matriz, int i, int j){

            //Caso base: Cuando se llegue a la posición 0, 0 de la matriz, se retorna el valor de esa posición
            if(i==0 && j==0){

                return matriz[i][j];

                //Primer caso recursivo: valor actual de posición + se retrocede en posición de columnas
            } else if (j>0) {
                return matriz[i][j] + sumarMatriz(matriz, i, j-1);
            }
                //Segundo caso recursivo: valor actual de posición + se retrocede en filas y se reinicia columnas en
            // posición final matriz[i].length-1
                return matriz[i][j] + sumarMatriz(matriz, i-1, matriz[i].length-1 );

        }

}
