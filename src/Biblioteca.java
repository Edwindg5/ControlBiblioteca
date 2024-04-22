import java.util.ArrayList;
import java.util.List;

class Biblioteca {
    private List<Libro> inventario;

    public Biblioteca() {
        this.inventario = new ArrayList<>();
    }

    public void altaLibro(String titulo, String autor) {
        Libro libro = new Libro(titulo, autor);
        inventario.add(libro);
        System.out.println("Libro dado de alta: " + libro);
    }

    public void registrarPrestamo(String titulo) {
        System.out.println("Préstamo registrado para el libro: " + titulo);
    }

    public void registrarDevolucion(String titulo) {
        System.out.println("Devolución registrada para el libro: " + titulo);
    }

    public void consultarMaterial() {
        System.out.println("Material bibliográfico disponible en la biblioteca:");
        for (Libro libro : inventario) {
            System.out.println(libro);
        }
    }
}