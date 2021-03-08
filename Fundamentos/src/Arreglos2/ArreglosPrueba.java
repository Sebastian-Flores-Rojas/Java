package Arreglos2;

public class ArreglosPrueba {
    
    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades: " + edades);
        
        edades[0] = 10;
        System.out.println("edades 0: " + edades[0]);
        edades[1] = 6;
        System.out.println("edades 1: " + edades[1]);
        edades[2] = 5;
        System.out.println("edades 2: " + edades[2]);
        
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edad elemento " + i + ": " + edades[i]);
        }
        
        String frutas[] = {"Naranja", "manzana", "uva", "cereza"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("fruta " + i + ": " + frutas[i]);
        }
    }
}
