package TrabajoPracticoN2.Ejercicio1;

public class Calculadora {

    public double sumar(double a, double b) {
        return a + b;
    }
    public double restar(double a, double b) {
        return a - b;
    }
    public double multiplicar(double a, double b) {
        return a * b;
    }
    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: no se puede dividir por cero.");
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Suma: " + calc.sumar(10, 5));           // 15.0
        System.out.println("Resta: " + calc.restar(10, 5));         // 5.0
        System.out.println("Multiplicación: " + calc.multiplicar(10, 5)); // 50.0
        System.out.println("División: " + calc.dividir(10, 5));     // 2.0
        System.out.println("División por cero: " + calc.dividir(10, 0)); // Error
    }
}
