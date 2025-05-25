package TrabajoPracticoN3.Ejercicio4;

public class ValidacionContrasena {

    public static boolean tieneLongitudValida(String pass) {
        return pass.length() >= 8;
    }

    public static boolean contieneNumero(String pass) {
        return pass.matches(".*\\d.*");
    }

    public static boolean contieneEspecial(String pass) {
        return pass.matches(".*[!@#$%^&*].*");
    }

    public static String construirContrasena(String base, String numero, String especial) {
        StringBuilder sb = new StringBuilder();
        sb.append(base).append(numero).append(especial);
        return sb.toString();
    }

    public static void main(String[] args) {
        String contrasena = "MiPass123@";
        System.out.println("Longitud válida: " + tieneLongitudValida(contrasena));
        System.out.println("Contiene número: " + contieneNumero(contrasena));
        System.out.println("Contiene especial: " + contieneEspecial(contrasena));

        String contrasenaSegura = construirContrasena("Programacion", "2025", "!");
        System.out.println("Contraseña segura generada: " + contrasenaSegura);
    }
}

