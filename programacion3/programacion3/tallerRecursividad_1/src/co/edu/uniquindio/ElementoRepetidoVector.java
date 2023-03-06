package co.edu.uniquindio;

public class ElementoRepetidoVector {

    public static void main(String[] args) {

        int[] vector = {0,1,2,3,2,2,4,5,6,2,2,7,8,9,2};
        int numRepetido = contarElementoRepetido(vector, 0, vector.length-1, 2);
        System.out.println("El elemento se repite: " + numRepetido + " veces");

    }

    public static int contarElementoRepetido(int [] vector, int inicio, int fin, int elem){
        //Caso base para parar recursión, si la posición de inicio es igual a la posición final, se evalúa si el
        // valor en esa posición es igual al elemento que buscamos, si corresponde al elemento, se retorna 1 para la
        // suma, en caso contrario se retorna un 0
        if(inicio==fin){
            if(vector[fin]==elem){
                return 1;
            }else{
                return 0;
            }
        }
        //Caso recursivo: En caso de que la posición de inicio no sea igual a la posición final, entonces se evalúa
        // el vector en la posición inicio y si corresponde al elemento, entonces se suma un 1 y se hace el llamado
        // recursivo aumentando en 1 la posición de inicio
        if(vector[inicio]==elem){
            return 1 + contarElementoRepetido(vector, inicio+1, fin, elem);
        }
        //En caso de que el vector evaluado en la posición inicio no corresponda al elemento, entonces directamente
        // se hace el llamado recursivo sin sumar ningún valor.
        return contarElementoRepetido(vector, inicio+1, fin, elem);

    }
}
