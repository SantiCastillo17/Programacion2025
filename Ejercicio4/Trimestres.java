package Ejercicio4;

import java.util.Scanner;

public class Trimestres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el año: ");
        int año = scanner.nextInt();

        if (mes >= 1 && mes <= 3) {
            System.out.println("Primer trimestre");
        } else if (mes >= 4 && mes <= 6) {
            System.out.println("Segundo trimestre");
        } else if (mes >= 7 && mes <= 9) {
            System.out.println("Tercer trimestre");
        } else if (mes >= 10 && mes <= 12) {
            System.out.println("Cuarto trimestre");
        } else {
            System.out.println("Mes inválido.");
        }

        scanner.close();
    }
}
