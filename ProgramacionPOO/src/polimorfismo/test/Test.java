package polimorfismo.test;

import polimorfismo.*;

public class Test {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Sebastian", 650000);
        System.out.println("empleado: " + empleado.obtenerDetalles());
        
        Gerente gerente = new Gerente("Pablo", 700000, "Informatica");
        System.out.println("Gerente: " + gerente.obtenerDetalles());
        
        // Aca ocurre el polimorfismo
        imprimir(empleado);
        imprimir(gerente);
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("-----------------------------------------------------");
        System.out.println("Polimorfismo empleado: " + empleado.obtenerDetalles());
    }
}
