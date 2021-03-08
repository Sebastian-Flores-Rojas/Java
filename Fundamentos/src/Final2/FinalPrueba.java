package Final2;

import Final.Persona;

public class FinalPrueba {
    
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable: " + miVariable);
        //miVariable = 5;
        
        //Persona.MI_CONSTANTE = 5;
        System.out.println("Mi constante: " + Persona.MI_CONSTANTE);
        
        final Persona persona1 = new Persona();
        persona1.setNombre("Sebastian");
        System.out.println("persona1: " + persona1.getNombre());
        persona1.setNombre("Andres");
        System.out.println("persona1: " + persona1.getNombre());
    }
}
