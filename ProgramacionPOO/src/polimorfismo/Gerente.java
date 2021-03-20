package polimorfismo;

public class Gerente extends Empleado{
    
    public Gerente(String nombre, double sueldo){
        super(nombre, sueldo);
    }
    
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", departamento: " + this.departamento;
    }
}
