package TrabajoPracticoN4.Ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class ManipulacionArreglos {

    public static int suma(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    public static int maximo(int[] arr) {
        return Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
    }

    public static int minimo(int[] arr) {
        return Arrays.stream(arr).min().orElse(Integer.MAX_VALUE);
    }

    public static void invertir(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos números querés ingresar?: ");
        int cantidad = scanner.nextInt();
        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresá el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nArreglo ingresado: " + Arrays.toString(numeros));

        System.out.println("Suma de los elementos: " + suma(numeros));
        System.out.println("Número máximo: " + maximo(numeros));
        System.out.println("Número mínimo: " + minimo(numeros));

        invertir(numeros);
        System.out.println("Arreglo invertido: " + Arrays.toString(numeros));

        scanner.close();
    }
}
