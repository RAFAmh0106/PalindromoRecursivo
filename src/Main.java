public class Main {
    //metodo wrapper
    public static boolean esPalindromo(String palabra){
        if (palabra == null){
            return false;
        }
        //ignorar mayusculas y espacios
        palabra = palabra.toLowerCase().replace(" ", "");

        //iniciar la recursividad
        return comprobarPalindromo(palabra,0, palabra.length()-1);
    }

    //metodo recursivo
    private static boolean comprobarPalindromo(String palabra,int izq, int der){
        //caso base
        if (izq>=der){
            return true;
        }
        //si los extremos son diferentes
        if (palabra.charAt(izq) != palabra.charAt(der)){
            return false;
        }
        //avanzar hacia el centro
        return comprobarPalindromo(palabra,izq + 1, der - 1);
    }

    public static void main(String[] args){
        System.out.println("reconocer:" + esPalindromo("reconocer"));
        System.out.println("radar:" + esPalindromo("radar"));
        System.out.println("Anna:" + esPalindromo("Anna"));
        System.out.println("hola:"+ esPalindromo("hola"));
        System.out.println("Anita lava la tina:" + esPalindromo("Anita lava la tina"));
        System.out.println("Cadena vacia:" + esPalindromo(""));
        System.out.println("Cadena nula:" + esPalindromo(null));
    }
}
