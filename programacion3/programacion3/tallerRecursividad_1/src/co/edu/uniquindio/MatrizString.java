package co.edu.uniquindio;

import java.util.ArrayList;

public class MatrizString {

    //Dada una matriz de String de 4 x 4 conformada por palabras,
    // hallar las palabras que tienen dos vocales seguidas de forma recursiva
    // y agregarlas a un ArrayList.

    public static void main(String[] args) {

        String [][] matriz = {{"vacio", "carro", "baul", "perro"},{"colombia","casa","moto", "caza"}
                ,{"llanta", "reir", "archivo", "silla"}, {"cocina","ola", "ave","freir"}};


        ArrayList<String> array = new ArrayList<>();
        ArrayList<String> hiatos = hallarPalabrasHiatos(matriz, 0, 0, array);

        System.out.println(hiatos);



    }

    public static ArrayList<String> hallarPalabrasHiatos(String[][] matriz, int i, int j, ArrayList<String> array) {

        //Casos base para continuar con los llamados recursivos

        //Evalua si la posición en la fila está dentro del rango
        if(i<=matriz.length-1){

            //Evalua si la posición de la columna está dentro del rango
            if (j<=matriz[i].length-1){

                //Llamado al método booleano para verificar que hay dos vocales juntas en la palabra ubicada en la
                // posición de la matriz[i][j]
                if(tieneVocalesJuntas(matriz[i][j],0)){

                    array.add(matriz[i][j]);

                }

                //Llamado recursivo para avanzar en las columnas
                hallarPalabrasHiatos(matriz, i, j+1, array);

            }else{
                //En caso de que las columnas se salgan de rango, se hace un llamado recursivo para reiniciar la
                // posición en columnas y avanzar una posición en las filas.
                hallarPalabrasHiatos(matriz, i+1, 0, array);

            }

        }
        //Cuando la condiciones del rango de la matriz no se cumplan, simplemente se retorna el arraylist
        return array;


    }

    public static boolean tieneVocalesJuntas(String palabra, int contador){


        char [] v = {'a', 'e', 'i', 'o', 'u'};
        //Caso base para controlar los llamados recursivos
        if(contador < palabra.length()-1){

            char l = palabra.charAt(contador);
            char ls = palabra.charAt(contador+1);
            //Esta condición evalua si la letra de la palabra es alguna de las vocales a, e, i, o ,u y si
            // esto se cumple para la letra siguiente a esa
            if((l==v[0] || l==v[1] || l==v[2] || l==v[3] || l==v[4]) && (ls==v[0] || ls==v[1] || ls==v[2] || ls==v[3] || ls==v[4])){

                return true;

            }

            else{
                //Si las dos letras comparadas no son vocales, se hace un llamado recursivo aumentando 1 al contador
                return tieneVocalesJuntas(palabra, contador+1);
            }

        }

        return false;

    }


}

