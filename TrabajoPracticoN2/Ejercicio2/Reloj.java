package TrabajoPracticoN2.Ejercicio2;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    public void establecerHora(int hora, int minuto, int segundo) {
        if (hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60 && segundo >= 0 && segundo < 60) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            System.out.println("Hora inválida.");
        }
    }

    public void mostrarHora() {
        System.out.printf("Hora actual: %02d:%02d:%02d\n", hora, minuto, segundo);
    }

    public void avanzarSegundo() {
        segundo++;

        if (segundo >= 60) {
            segundo = 0;
            minuto++;
        }

        if (minuto >= 60) {
            minuto = 0;
            hora++;
        }

        if (hora >= 24) {
            hora = 0;
        }
    }

    public static void main(String[] args) {
        Reloj miReloj = new Reloj();

        miReloj.establecerHora(10, 12, 42);

        for (int i = 0; i < 3; i++) {
            miReloj.mostrarHora();
            miReloj.avanzarSegundo();
        }
    }
}
