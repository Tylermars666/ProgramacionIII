package co.edu.uniquindio;

public class RetornarNumeroFila {

    public static void main(String[] args) {

        int [][] matriz = {{10,20,30}, {4,5,6},{7,8,9}};
        int suma = sumarFila(matriz[0],0, matriz.length-1);
        int filaMayor = calcularFilaMayor(matriz, 0, 0,suma);
        System.out.println("La fila con la suma mayor es: " + filaMayor);

    }

    public static int calcularFilaMayor(int[][] matriz, int i, int numFila, int suma){

        //Caso base: En caso de que la posición de la fila sea la última, entonces se retorna el número de fila mayor
        if(i==matriz.length-1){
            return numFila;
        }else{
            //Se crea variable sumaAux para almacenar la suma de la fila posterior a la actual
            int sumaAux = sumarFila(matriz[i+1],0, matriz.length-1);
            //Se comparan sumas y de acuerdo al valor mayor, se invoca nuevamente a la función enviando por parámetro
            // la suma dada
            if(suma>sumaAux){
                return calcularFilaMayor(matriz, i+1,numFila,suma);
            }else{
                return calcularFilaMayor(matriz, i+1, numFila+1, sumaAux);
            }

        }


    }

    //MÉTODO RECURSIVO PARA SUMAR FILA
    public static int sumarFila(int[] fila,int primero, int ultimo){
        //Caso base: Se evalua si la posición inicial es igual a la final, y en caso de ser true, se retorna el
        // valor ubicado en esa posición
        if(primero==ultimo){

            return fila[ultimo];
        }
        //Caso recursivo: al valor actual de la posición se le suma el llamado recursivo aumentando la posición
        return fila[primero]+ sumarFila(fila, primero+1, ultimo);

    }
}


//
