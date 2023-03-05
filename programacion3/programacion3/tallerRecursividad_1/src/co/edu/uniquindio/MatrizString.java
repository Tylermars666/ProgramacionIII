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

        if(i<=matriz.length-1){

            if (j<=matriz[i].length-1){

                if(tieneVocalesJuntas(matriz[i][j],0)){

                    array.add(matriz[i][j]);

                }

                hallarPalabrasHiatos(matriz, i, j+1, array);

            }else{

                hallarPalabrasHiatos(matriz, i+1, 0, array);

            }

        }

        return array;


    }

    public static boolean tieneVocalesJuntas(String palabra, int contador){

        //VACIO

        char [] v = {'a', 'e', 'i', 'o', 'u'};

        if(contador < palabra.length()-1){

            char l = palabra.charAt(contador);
            char ls = palabra.charAt(contador+1);

            if((l==v[0] || l==v[1] || l==v[2] || l==v[3] || l==v[4]) && (ls==v[0] || ls==v[1] || ls==v[2] || ls==v[3] || ls==v[4])){

                return true;

            }

            else{

                return tieneVocalesJuntas(palabra, contador+1);
            }

        }

        return false;

    }


}

