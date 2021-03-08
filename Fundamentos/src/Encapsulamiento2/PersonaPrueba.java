package Encapsulamiento2;

import Encapsulamiento.Persona;

public class PersonaPrueba {
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Sebastian", 500000.00, false);
        System.out.println("persona1: " + persona1);
        persona1.setNombre("Sebastian Flores");
        persona1.setEliminado(true);
        
        // System.out.println("persona 1 datos: " + persona1.getNombre() + " " + persona1.getSueldo() + " " + persona1.isEliminado());
        System.out.println("persona1: " + persona1);
    }
}
