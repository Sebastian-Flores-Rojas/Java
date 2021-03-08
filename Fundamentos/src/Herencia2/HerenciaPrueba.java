package Herencia2;

import Herencia.Cliente;
import Herencia.Empleado;
import java.util.Date;

public class HerenciaPrueba {
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Sebastian", 5000.0);
        System.out.println("empleado1: " + empleado1);
        
        Cliente cliente1 = new Cliente(new Date(), true, "Sebastian", 'M', 0, "Viña");
        System.out.println("cliente1: " + cliente1);
    }
}
