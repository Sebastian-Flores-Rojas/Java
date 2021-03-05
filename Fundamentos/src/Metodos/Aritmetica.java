package Metodos;

public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;
    
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
