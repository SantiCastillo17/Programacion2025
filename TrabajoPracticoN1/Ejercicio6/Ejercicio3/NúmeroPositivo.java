package TrabajoPracticoN1.Ejercicio6.Ejercicio3;

import java.util.Scanner;

public class NúmeroPositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número positivo (1-99): ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 99) {
            if (numero < 10) {
                System.out.println("El número tiene un dígito.");
            } else {
                System.out.println("El número tiene dos dígitos.");
            }
        } else {
            System.out.println("Número fuera de rango.");
        }

        scanner.close();
    }
}
