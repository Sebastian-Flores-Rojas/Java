package autoboxingUnboxing.test;

public class Test {
    public static void main(String[] args) {
        // Clases envolventes de tipos primitivos
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
        */
        
        // Autoboxing
        Integer entero = 10;
        System.out.println("entero: " + entero);
        System.out.println("entero: " + entero.toString());
        System.out.println("entero: " + entero.doubleValue());
        System.out.println("entero: " + entero.toString());
        
        // Uboxing
        int entero2 = entero;
        System.out.println("entero2: " + entero2);
    }
}
