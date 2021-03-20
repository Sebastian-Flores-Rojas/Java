package instanciaOf.test;

import instanciaOf.*;

public class Test {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Sebastian", 650000);
        //determinarTipo(empleado);
        
        empleado = new Gerente("Pablo", 700000, "Informatica");
        determinarTipo(empleado);
    }
    
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo gerente");
            // Se hace una conversion para acceder a lo que traiga empleado
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente departamento: " + gerente.getDepartamento());
            // O se puede hacer directo
            System.out.println("gerente departamento: " + ((Gerente) empleado).getDepartamento());
            
        } else if (empleado instanceof  Empleado) {
            System.out.println("Es de tipo empleado");
            System.out.println("empleado nombre: " + empleado.getNombre());
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
            empleado.toString();
        }
    }
}
