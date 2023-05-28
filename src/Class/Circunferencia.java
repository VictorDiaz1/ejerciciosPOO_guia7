package Class;

import java.util.Scanner;

public class Circunferencia {

    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia: ");
        radio = sc.nextDouble();

    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
        //System.out.println("area = " + area);

    }

    public double perimetro() {
        return 2 * Math.PI * radio;
        //System.out.println("perimetro = " + perimetro);

    }
}
