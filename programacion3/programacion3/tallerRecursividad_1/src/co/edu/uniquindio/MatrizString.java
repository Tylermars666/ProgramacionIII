package co.edu.uniquindio;

import java.util.ArrayList;

public class MatrizString {

    //Dada una matriz de String de 4 x 4 conformada por palabras,
    // hallar las palabras que tienen dos vocales seguidas de forma recursiva
    // y agregarlas a un ArrayList. Ejemplo de la matriz a probaren el archivo adjunto.

    public static void main(String[] args) {

        String [][] matriz = {{"vacio", "carro", "baul", "perro"},{"colombia","casa","moto", "caza"}
                ,{"llanta", "reir", "archivo", "silla"}, {"cocina","ola", "ave","freir"}};

        ArrayList<String> hiatos = new ArrayList<>();
        ArrayList<String> array = new ArrayList<>();
        hiatos = hallarPalabrasHiatos(matriz, 0, 0, array);

        System.out.println(hiatos);



    }

    private static ArrayList<String> hallarPalabrasHiatos(String[][] matriz, int i, int j, ArrayList<String> array) {

        return null;
    }

}

