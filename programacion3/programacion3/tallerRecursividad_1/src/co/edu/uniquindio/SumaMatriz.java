package co.edu.uniquindio;

public class SumaMatriz {

    public static void main( String [] args){

        //3. Suma de una matriz de forma recursiva. Retrocediendo en filas y columnas

        int [][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        int sumaMatriz = sumarMatriz(matriz, matriz.length-1, matriz[0].length-1);
        System.out.println("Esta es la suma: " + sumaMatriz);
        }



        public static int sumarMatriz(int [][] matriz, int i, int j){

            //Caso base: Cuando i == 0 y j==0, return matriz[i][j]
            if(i==0 && j==0){

                return matriz[i][j];

                //Primer caso recursivo
            } else if (j>0) {
                return matriz[i][j] + sumarMatriz(matriz, i, j-1);
            }
                //Segundo caso recursivo
                return matriz[i][j] + sumarMatriz(matriz, i-1, matriz[0].length-1 );

        }

}
