package modificadoresAcceso.paquete1;

//public class Clase1 {
//    public String atributoPublico = "Valor atributo publico";
//
//    public Clase1() {
//        System.out.println("Constructor Publico");
//    }
//    
//    public void metodoPublico(){
//        System.out.println("Metodo publico");
//    }
//}
  
//  public class Clase1{
//      protected String atributoProtected = "Valor atributo protected";
//      
//      protected Clase1(){
//          System.out.println("Constructor protected");
//      }
//      
//      public Clase1(String arg){
//          System.out.println("Constructor publico");
//      }
//      
//      protected void metodoProtected(){
//          System.out.println("Metodo protected");
//      }
//  }
   
// Solo dentro del mismo pquete con default
//    class Clase1 {
//        String atributoDefault = "Valor atributo default";
//
//    public Clase1() {
//        System.out.println("Constructor default");
//    }
//    
//    void metodoDefault(){
//        System.out.println("Metodo default");
//    }
//    }

class Clase1 {
       private String atributoPrivado = "Valor atributo privado";

    private Clase1() {
        System.out.println("Constructor privado");
    }
    
    private void metodoDefault(){
        System.out.println("Metodo privado");
    }
    }