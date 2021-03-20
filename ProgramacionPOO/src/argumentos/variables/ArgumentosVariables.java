package argumentos.variables;

public class ArgumentosVariables {
    public static void main(String[] args) {
        variosParametros("Seba", 1, 4, 2);
        
        imprimirNumeros(1, 4, 5, 2, 7, 9);
        imprimirNumeros(3, 4, 1);
        
        imprimirPalabras("Hola", "soy Sebastian");
        imprimirPalabras("hola", "esto", "es una", "prueba");
    }
    
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre: " + nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirPalabras(String... palabras){
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }
    
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
