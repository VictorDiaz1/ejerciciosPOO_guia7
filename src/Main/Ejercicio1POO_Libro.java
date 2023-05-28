package Main;

import Class.Libro;

public class Ejercicio1POO_Libro {

    public static void main(String[] args) {

        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        libro1.cargarLibro();
        libro2.cargarLibro();
        libro1.mostrarLibro();
        libro2.mostrarLibro();

    }

}
