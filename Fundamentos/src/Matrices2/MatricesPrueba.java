package Matrices2;

import Matrices.Persona;

public class MatricesPrueba {
    
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades: " + edades);
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[2][0] = 2;
        edades[2][1] = 9;
        
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                System.out.println("edad [" + i + "][" + j + "]: " + edades[i][j]);
            }
        }
        
        String frutas[][] = {{"Naranja", "Limon"}, {"Mora", "Ciruela"}, {"Sandia", "Melon"}};
        
        imprimir(frutas);
        
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Sebastian");
        personas[0][1] = new Persona("Andres");
        personas[0][2] = new Persona("Carlos");
        personas[1][0] = new Persona("David");
        personas[1][1] = new Persona("Cecilia");
        personas[1][2] = new Persona("Veronica");
        
        imprimir(personas);
    }
    // Se crea un metdo imprimir para reutilizar
    public static void imprimir(Object matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("persona [" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }
    }
    
}
