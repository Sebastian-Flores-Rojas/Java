package This;

public class PalabraThis {
    
    public static void main(String[] args) {
        Persona persona = new Persona("Sebastian", "Flores");
        System.out.println("Persona: " + persona);
        System.out.println("Persona nombre: " + persona.nombre);
        System.out.println("Persona apellido: " + persona.apellido);
    }
}

class Persona {
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
        System.out.println("Nombre de la persona: " + this.nombre  + " " + this.apellido);
        // Se manda objeto persona por this hacia clase Imprimir
        new Imprimir().imprimir(this);
    }
}

class Imprimir {
    String nombre;
    
    public void imprimir(Persona persona){
        System.out.println("Persona desde  imprimir: " + persona);
        System.out.println("Imprimir objeto actual (this): " + this);
        this.nombre = persona.nombre;
    }
}
