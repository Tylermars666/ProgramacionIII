package co.edu.uniquindio;

public class InvertirPalabra {

    public static void main(String[] args) {

        //2. Invertir una palabra de forma recursiva. Invertir cuando se deuelva la recursión.

        String word = "Hola";
        String reverseWord = invertirPalabra(word);
        System.out.println(reverseWord);

    }
        public static String invertirPalabra(String palabra) {
            //Caso base
            if (palabra.length() == 0) {
                return palabra;
            } else {
                //Caso recursivo
                return invertirPalabra(palabra.substring(1)) + palabra.charAt(0);
            }
        }


}
