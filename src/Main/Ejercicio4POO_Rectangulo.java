package Main;

import Class.Rectangulo;

public class Ejercicio4POO_Rectangulo {

    public static void main(String[] args) {

        Rectangulo rect = new Rectangulo();
        rect.crearRectangulo();
        rect.calcularPerimetro();
        rect.calcularSuperficie();
        rect.dibujarRectangulo();
        System.out.println("El perimetro es: " + rect.calcularPerimetro());
        System.out.println("La superficie es: " + rect.calcularSuperficie());

    }

}
