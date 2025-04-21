package Ejercicio6;

import java.util.Scanner;

public class Triángulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad;
        int eq = 0, iso = 0, esc = 0;

        System.out.print("Ingrese la cantidad de triángulos: ");
        cantidad = scanner.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Triángulo " + i + ":");
            System.out.print("Lado 1: ");
            int lado1 = scanner.nextInt();
            System.out.print("Lado 2: ");
            int lado2 = scanner.nextInt();
            System.out.print("Lado 3: ");
            int lado3 = scanner.nextInt();

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Equilátero");
                eq++;
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Isósceles");
                iso++;
            } else {
                System.out.println("Escaleno");
                esc++;
            }
        }

        System.out.println("Resumen:");
        System.out.println("Equiláteros: " + eq);
        System.out.println("Isósceles: " + iso);
        System.out.println("Escalenos: " + esc);

        if (eq <= iso && eq <= esc) {
            System.out.println("Equilátero es el tipo con menor cantidad.");
        } else if (iso <= eq && iso <= esc) {
            System.out.println("Isósceles es el tipo con menor cantidad.");
        } else {
            System.out.println("Escaleno es el tipo con menor cantidad.");
        }

        scanner.close();
    }
}
