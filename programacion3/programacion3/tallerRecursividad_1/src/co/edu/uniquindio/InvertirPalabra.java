package co.edu.uniquindio;

/**
 * @Author: Omar Piedrahita - Carlos Mancera
 */
public class InvertirPalabra {

    public static void main(String[] args) {

        //2. Invertir una palabra de forma recursiva. Invertir cuando se deuelva la recursión.

        String word = "Hola";
        String reverseWord = invertirPalabra(word);
        System.out.println(reverseWord);

    }
        public static String invertirPalabra(String palabra) {
            //Caso base, si el tamaño de la palabra es 0 o 1, directamente se retorna la palabra.
            if (palabra.length() <= 1) {
                return palabra;
            } else {
                //Caso recursivo: Se invoca la función nuevamente quitando la primera letra y posteriormente
                // concatenando esta misma letra al final para invertir así su orden
                return invertirPalabra(palabra.substring(1)) + palabra.charAt(0);
            }
        }


}
