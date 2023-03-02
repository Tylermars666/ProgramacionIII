package co.edu.uniquindio;

public class ElementoRepetidoVector {

    public static void main(String[] args) {

        int[] vector = {0,1,2,3,2,2,4,5,6,2,2,7,8,9,2};
        int numRepetido = contarElementoRepetido(vector, 0, vector.length-1, 2);
        System.out.println("El elemento se repite: " + numRepetido + " veces");

    }

    public static int contarElementoRepetido(int [] vector, int inicio, int fin, int elem){

        if(inicio==fin){
            if(vector[fin]==elem){
                return 1;
            }else{
                return 0;
            }
        }
        if(vector[inicio]==elem){
            return 1 + contarElementoRepetido(vector, inicio+1, fin, elem);
        }

        return contarElementoRepetido(vector, inicio+1, fin, elem);

    }
}
