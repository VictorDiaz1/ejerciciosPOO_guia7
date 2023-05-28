
package Class;

import java.util.Scanner;

public class Libro {

    public int ISBN;
    public String titulo;
    public String autor;
    public int numeroDePaginas;
    
      public Libro() {

    }

    public Libro(int ISBN, String titulo, String autor, int numeroDePaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }
      

    public void cargarLibro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese ISBN:");
        this.ISBN = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese titulo: ");
        this.titulo = sc.nextLine();
        System.out.println("Ingrese autor: ");
        this.autor = sc.nextLine();
        System.out.println("Ingrese numero de paginas: ");
        this.numeroDePaginas = sc.nextInt();
    }

  

    public void mostrarLibro() {
        System.out.println("ISBN = " + this.ISBN);
        System.out.println("titulo = " + this.titulo);
        System.out.println("autor = " + this.autor);
        System.out.println("numeroDePaginas = " + this.numeroDePaginas);
    }

}
