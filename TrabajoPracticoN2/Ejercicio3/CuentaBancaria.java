package TrabajoPracticoN2.Ejercicio3;

public class CuentaBancaria {

    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto){
        if (monto > 0){
            saldo += monto;
            System.out.println("Depositó exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor que cero.");
        }
    }

    public void retirar(double monto){
        if (monto <= saldo){
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Error: Saldo insuficiente.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void mostrarInformacion() {
        System.out.println("Cuenta N°: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo Actual: $" + saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria micuenta = new CuentaBancaria("12345", "Andres Iniesta", 1000);

        micuenta.mostrarInformacion();
        micuenta.depositar(500);
        micuenta.retirar(200);
        double saldoActual = micuenta.consultarSaldo();
        System.out.println("Saldo actual consultarlo: $" + saldoActual);
        micuenta.retirar(2000);
    }
}