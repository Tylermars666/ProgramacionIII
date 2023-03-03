package co.edu.uniquindio;

public class RetornarNumeroFila {

    public static void main(String[] args) {

        int [][] matriz = {{1,2,3}, {4,5,6},{7,8,9}};
        int filaMayor = calcularFilaMayor(matriz, 0, 0,0);
        System.out.println("La fila con la suma mayor es: " + filaMayor);

    }

    public static int calcularFilaMayor(int[][] matriz, int i, int numFila, int suma){


        if(i==matriz.length-1){
            return numFila;
        }else{

            int suma2 = sumarFila(matriz[i+1],i, matriz.length-1);

            if(suma>suma2){
                return calcularFilaMayor(matriz, i+1,numFila,suma);
            }else{
                return calcularFilaMayor(matriz, i+1, numFila+1, suma2);
            }

        }


    }

    //MÉTODO RECURSIVO PARA SUMAR FILA
    public static int sumarFila(int[] fila,int primero, int ultimo){

        if(primero==ultimo){

            return fila[ultimo];
        }

        return fila[primero]+ sumarFila(fila, primero+1, ultimo);

    }
}


//
