package TrabajoPracticoN4.Ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class BusquedaEnArreglos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el arreglo de cadenas
        String[] arreglo = {"Banana", "Manzana", "Cereza", "Fresa", "Durazno", "Kiwi", "Uva"};

        // Ordenar el arreglo alfabéticamente
        Arrays.sort(arreglo);
        System.out.println("Arreglo ordenado alfabéticamente:");
        System.out.println(Arrays.toString(arreglo));

        // Solicitar al usuario una cadena para buscar
        System.out.print("Ingresa una cadena para buscar: ");
        String cadenaBuscada = scanner.nextLine();

        // Buscar la cadena usando binarySearch
        int posicion = Arrays.binarySearch(arreglo, cadenaBuscada);

        // Mostrar el resultado
        if (posicion >= 0) {
            System.out.println("La cadena \"" + cadenaBuscada + "\" fue encontrada en la posición: " + posicion);
        } else {
            System.out.println("La cadena \"" + cadenaBuscada + "\" no fue encontrada en el arreglo.");
        }

        // Prueba con otro arreglo
        System.out.println("\n--- Nueva prueba con otro arreglo ---");
        String[] otroArreglo = {"Zorro", "Perro", "Gato", "Elefante", "Araña"};
        Arrays.sort(otroArreglo);
        System.out.println("Nuevo arreglo ordenado:");
        System.out.println(Arrays.toString(otroArreglo));

        System.out.print("Ingresa otra cadena para buscar: ");
        String otraCadena = scanner.nextLine();

        int nuevaPosicion = Arrays.binarySearch(otroArreglo, otraCadena);
        if (nuevaPosicion >= 0) {
            System.out.println("La cadena \"" + otraCadena + "\" fue encontrada en la posición: " + nuevaPosicion);
        } else {
            System.out.println("La cadena \"" + otraCadena + "\" no fue encontrada en el nuevo arreglo.");
        }

        scanner.close();
    }
}

