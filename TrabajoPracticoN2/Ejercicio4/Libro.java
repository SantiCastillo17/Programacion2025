package TrabajoPracticoN2.Ejercicio4;

public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean prestado;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prestado = false; // Por defecto el libro está disponible
    }

    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("El libro ya estaba disponible.");
        }
    }

    public void mostrarInformacion() {
        String estado = prestado ? "Prestado" : "Disponible";
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Estado: " + estado);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Libro miLibro = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", "9780345339683");

        miLibro.mostrarInformacion();
        miLibro.prestar();
        miLibro.mostrarInformacion();
        miLibro.devolver();
        miLibro.mostrarInformacion();
    }
}
