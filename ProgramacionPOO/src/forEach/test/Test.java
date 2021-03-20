package forEach.test;

import forEach.Persona;

public class Test {
    public static void main(String[] args) {
        int edades[] = {5, 6, 8, 9};
        int i = 1;
        
        for(int edad: edades){
            System.out.println("Edad: " + edad + " indice: " + i++);
        }
        
        Persona personas[] = {new Persona("Sebastian"), new Persona("Pablo"), new Persona("Ignacio")};
        
        for(Persona persona: personas){
            System.out.println("Persona: " + persona.toString());
        }
    }
}
