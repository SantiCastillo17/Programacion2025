package TrabajoPracticoN1.Ejercicio6.Ejercicio5;

import java.util.Scanner;

public class Coordenada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la coordenada X (≠ 0): ");
        int x = scanner.nextInt();
        System.out.print("Ingrese la coordenada Y (≠ 0): ");
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("1º Cuadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("2º Cuadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("3º Cuadrante");
        } else if (x > 0 && y < 0) {
            System.out.println("4º Cuadrante");
        } else {
            System.out.println("Las coordenadas no deben ser cero.");
        }

        scanner.close();
    }
}
