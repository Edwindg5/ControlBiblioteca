import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Usuario usuario = new Usuario(biblioteca);
        Scanner scanner = new Scanner(System.in);

        // Menú de opciones
        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Alta de libros");
            System.out.println("2. Registro de préstamo a domicilio");
            System.out.println("3. Registro de devolución de libros");
            System.out.println("4. Consulta de material bibliográfico");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    System.out.print("Ingrese el título del libro: ");
                    String tituloLibro = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autorLibro = scanner.nextLine();
                    biblioteca.altaLibro(tituloLibro, autorLibro);
                    break;
                case 2:
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    System.out.print("Ingrese el título del libro prestado: ");
                    String tituloPrestamo = scanner.nextLine();
                    biblioteca.registrarPrestamo(tituloPrestamo);
                    break;
                case 3:
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    System.out.print("Ingrese el título del libro devuelto: ");
                    String tituloDevolucion = scanner.nextLine();
                    biblioteca.registrarDevolucion(tituloDevolucion);
                    break;
                case 4:
                    usuario.consultarMaterial();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 5);
    }
}
