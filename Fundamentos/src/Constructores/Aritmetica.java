package Constructores;

public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;
    
    // Contructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }
    
    // Sobrecarga de Constructor
    public Aritmetica(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
        System.out.println("Ejecutando constructor con argumentos");
    }
    
    // Metodos de la clase
    public void sumar(){
        int resultado = a + b;
        System.out.println("Resultado: " + resultado);
    }
    
    public int sumarConRetorno(){
        // int resultado = a + b;
        // return resultado;
        return a + b;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b = b;
        return this.a + this.b;
    }
}
