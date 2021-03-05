package Clases;

import java.util.Scanner;

public class PruebaPersona {
    
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Sebastian";
        persona1.apellido = "Flores";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        persona2.nombre = "Andrea";
        persona2.apellido = "Rojas";
        persona2.desplegarInformacion();
    }
}
