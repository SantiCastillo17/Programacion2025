package TrabajoPracticoN4.Ejercicio2;

import java.util.*;

public class OrdenamientoMain {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static int[] generarArregloAleatorio(int tamaño) {
        Random rand = new Random();
        int[] arr = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            arr[i] = rand.nextInt(10000);
        }
        return arr;
    }

    public static void compararTiempos(int tamaño) {
        int[] arr1 = generarArregloAleatorio(tamaño);
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);

        long inicioBubble = System.nanoTime();
        bubbleSort(arr1);
        long finBubble = System.nanoTime();

        long inicioArraysSort = System.nanoTime();
        Arrays.sort(arr2);
        long finArraysSort = System.nanoTime();

        System.out.println("Tamaño del arreglo: " + tamaño);
        System.out.println("Tiempo Bubble Sort: " + (finBubble - inicioBubble) / 1_000_000.0 + " ms");
        System.out.println("Tiempo Arrays.sort(): " + (finArraysSort - inicioArraysSort) / 1_000_000.0 + " ms");
        System.out.println("---------------------------------------------");
    }

    static class Producto implements Comparable<Producto> {
        String nombre;
        double precio;
        int stock;

        public Producto(String nombre, double precio, int stock) {
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

        @Override
        public int compareTo(Producto otro) {
            return Double.compare(this.precio, otro.precio);
        }

        @Override
        public String toString() {
            return nombre + " - Precio: $" + precio + " - Stock: " + stock;
        }
    }

    static class ComparadorPorNombre implements Comparator<Producto> {
        @Override
        public int compare(Producto p1, Producto p2) {
            return p1.nombre.compareToIgnoreCase(p2.nombre);
        }
    }

    static class ComparadorPorStock implements Comparator<Producto> {
        @Override
        public int compare(Producto p1, Producto p2) {
            return Integer.compare(p1.stock, p2.stock);
        }
    }

    public static void main(String[] args) {
        compararTiempos(100);
        compararTiempos(1000);
        compararTiempos(10000);

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Laptop", 1200.0, 10));
        productos.add(new Producto("Teclado", 50.0, 100));
        productos.add(new Producto("Mouse", 25.0, 200));
        productos.add(new Producto("Monitor", 300.0, 15));

        Collections.sort(productos, new ComparadorPorNombre());
        System.out.println("Ordenados por nombre:");
        for (Producto p : productos) {
            System.out.println(p);
        }

        Collections.sort(productos);
        System.out.println("\nOrdenados por precio:");
        for (Producto p : productos) {
            System.out.println(p);
        }

        Collections.sort(productos, new ComparadorPorStock());
        System.out.println("\nOrdenados por stock:");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}