package TrabajoPracticoN1.Ejercicio6.Ejercicio2;

import java.util.Scanner;

public class Parciales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3;

        System.out.print("Ingrese la primera nota: ");
        nota1 = scanner.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        nota2 = scanner.nextDouble();
        System.out.print("Ingrese la tercera nota: ");
        nota3 = scanner.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 8) {
            System.out.println("El alumno está promocionado.");
        } else {
            System.out.println("El alumno no está promocionado.");
        }
        scanner.close();
        {
        }

    }
}