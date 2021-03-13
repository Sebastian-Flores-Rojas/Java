package Herencia;
// El extends Persona hace referencia a la herencia de la clase Persona con atributos
public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadoEmpleado;

    public Empleado(){
        this.idEmpleado = ++Empleado.contadoEmpleado;
    }
    
    public Empleado(String nombre, double sueldo) {
        // Este this() llama a los this del primer constructor
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;
    }    

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        // Clase hija
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", nombre=").append(this.nombre);
        sb.append(", sueldo=").append(this.sueldo);
        // Clase padre
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
