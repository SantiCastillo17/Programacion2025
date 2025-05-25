package TrabajoPracticoN3.Ejercicio2;

public class InteresCompuesto {

    public static void main(String[] args) {
        double capitalInicial = 10000;
        double tasaInteres = 0.06;
        int anios = 5;

        double valorFuturo = capitalInicial * Math.pow(1 + tasaInteres, anios);
        System.out.println("Valor futuro (sin redondeo): $" + valorFuturo);

        System.out.println("Valor futuro redondeado hacia arriba (ceil): $" + Math.ceil(valorFuturo));
        System.out.println("Valor futuro redondeado hacia abajo (floor): $" + Math.floor(valorFuturo));
        System.out.println("Valor futuro redondeado al entero más cercano (round): $" + Math.round(valorFuturo));
    }
}

