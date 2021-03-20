package sobreescritura.test;

import sobreescritura.Gerente;

public class Test {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Sebastian", 650000, "Informatica");
        System.out.println("gerente1: " + gerente1.obtenerDetalles());
    }
}
