package conversionObjetos;

public class Gerente extends Empleado{
    public Gerente(String nombre, double sueldo) {
        super(nombre, sueldo);
    }
    
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    // Al colorcar @Override indicamos la sobreescritura
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", Departamento: " + this.departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
