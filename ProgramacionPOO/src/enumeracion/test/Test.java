package enumeracion.test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class Test {
    public static void main(String[] args) {
        System.out.println("Dia 1: " + Dias.LUNES);
        indicarDiaDeSemana(Dias.MARTES);
        
        System.out.println("Continente numero 4: " + Continentes.AMERICA);
        System.out.println("Numero de paises en el 4to lugar: " 
                + Continentes.AMERICA.getPaises());
    }
    
    private static void indicarDiaDeSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;                
        }
    }
    
    
}
