package Ejercicio1;
import java.util.Scanner;
public class NotasMateria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la nota: ");
        int nota = scanner.nextInt();
        if (nota < 4) {
            System.out.println("Desaprobó la materia.");
        } else if (nota == 10) {
            System.out.println("Sos un capo. ¡Sobresaliente!");
        } else {
            System.out.println("Aprobaste la materia.");
        }
        scanner.close();
    }
}
