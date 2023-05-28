package Class;

import java.util.Scanner;

public class Operacion {

    private int num1, num2;

    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void crearOperacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero 1: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el numero 2: ");
        num2 = sc.nextInt();

    }

    public int suma() {
        return num1 + num2;
    }

    public int resta() {
        return num1 - num2;
    }

    public int multiplicacion() {
        if (num1 != 0 && num2 != 0) {
            return num1 * num2;

        } else {
            System.out.println("Error");
            return 0;
        }
    }

    public int division() {
        if (num2 != 0) {
            return num1 / num2;

        } else {
            System.out.println("Error division por 0");
            return 0;
        }
    }

}
