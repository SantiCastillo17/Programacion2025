package TrabajoPracticoN2.Ejercicio5;

public class Empleado {

    private int legajo;
    private String nombre;
    private double salario;

    private static int contadorEmpleados = 0;

    public Empleado(String nombre, double salarioInicial) {
        this.legajo = ++contadorEmpleados;
        this.nombre = nombre;
        this.salario = salarioInicial;
    }

    public void aumentarSalarioPorcentaje(double porcentaje) {
        if (porcentaje > 0) {
            double aumento = salario * porcentaje / 100;
            salario += aumento;
            System.out.println("Aumento del " + porcentaje + "% aplicado. Nuevo salario: $" + salario);
        } else {
            System.out.println("El porcentaje debe ser mayor a 0.");
        }
    }

    public void aumentarSalarioMonto(double monto, String motivo) {
        if (monto > 0) {
            salario += monto;
            System.out.println("Aumento de $" + monto + " aplicado. Motivo: " + motivo);
            System.out.println("Nuevo salario: $" + salario);
        } else {
            System.out.println("El monto debe ser mayor a 0.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Legajo: " + legajo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario actual: $" + salario);
        System.out.println("-------------------------------");
    }

    public static int getCantidadEmpleados() {
        return contadorEmpleados;
    }

    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Ana Torres", 50000);
        Empleado emp2 = new Empleado("Luis Pérez", 60000);

        emp1.mostrarInformacion();
        emp1.aumentarSalarioPorcentaje(10);
        emp1.aumentarSalarioMonto(5000, "Bono por desempeño");
        emp1.mostrarInformacion();

        emp2.mostrarInformacion();
        emp2.aumentarSalarioMonto(3000, "Ajuste por inflación");

        System.out.println("Total de empleados: " + Empleado.getCantidadEmpleados());
    }
}

