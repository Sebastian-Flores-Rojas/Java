package bloquesInicializacion;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    // Los bloques se inicializan antes que los contructores
    static{
        System.out.println("Ejecucion bloque estatico");
        ++contadorPersona;
    }
    
    {
        System.out.println("Ejecucion de bloque NO estatico");
        this.idPersona = contadorPersona++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
    
}
