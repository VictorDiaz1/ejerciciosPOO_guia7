package Main;

import Class.Circunferencia;

public class Ejercicio2POO_Circunferencia {

    public static void main(String[] args) {

        Circunferencia circunf_1 = new Circunferencia(25);
        System.out.println("area c1: " + circunf_1.area());
        System.out.println("perimetro c1: " + circunf_1.perimetro());

        Circunferencia circunf_2 = new Circunferencia();
        circunf_2.crearCircunferencia();
        System.out.println("area: " + circunf_2.area());
        System.out.println("perimetro: " + circunf_2.perimetro());
    }

}
