package Arreglos2;

import Arreglos.Persona;

public class ArreglosObject {
    
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        
        personas[0] = new Persona("Sebastian");
        personas[1] = new Persona("Andres");
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas " + i + ": " + personas[i].toString());
        }
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas " + i + " nombre: " + personas[i].getNombre());
        }
    }
}
