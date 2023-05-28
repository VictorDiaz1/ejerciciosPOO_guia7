package Class;

import java.util.Scanner;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo: ");
        base = sc.nextInt();
        System.out.println("Ingrese la altura del rectangulo: ");
        altura = sc.nextInt();
    }

    public int calcularSuperficie() {
        return base * altura;
    }

    public int calcularPerimetro() {
        return (base + altura) * 2;
    }

    public void dibujarRectangulo() {

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println(" ");

        }

    }

}
