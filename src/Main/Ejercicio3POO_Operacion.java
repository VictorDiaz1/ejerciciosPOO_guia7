package Main;

import Class.Operacion;

public class Ejercicio3POO_Operacion {

    public static void main(String[] args) {
        Operacion numero = new Operacion();
        numero.crearOperacion();
//        numero.suma();
//        numero.resta();
//        numero.multiplicacion();
//        numero.division();
        System.out.println("suma = " + numero.suma());
        System.out.println("resta = " + numero.resta());
        System.out.println("multiplicacion = " + numero.multiplicacion());
        System.out.println("division = " + numero.division());

    }

}
