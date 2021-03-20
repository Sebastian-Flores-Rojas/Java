package conversionObjetos.test;

import conversionObjetos.Empleado;
import conversionObjetos.Escritor;
import conversionObjetos.TipoEscritura;

public class Test {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Sebastian", 500000, TipoEscritura.CLASICO);
        
        System.out.println("Escritor: " + empleado.toString());
        
        // para mostrar los get del tipo hijo hay que generar una conversion del padre al hijo
        ((Escritor)empleado).getTipoEscritura();
        // o se puede convertir de esta forma
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
    }
}
