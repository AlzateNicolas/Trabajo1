package w3;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        System.out.println(">>> CREACIÓN DE LIBROS Y AGREGADO A LA BIBLIOTECA <<<\n");

        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "978-0307474728");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-8424936464");
        Libro libro3 = new Libro("1984", "George Orwell", "978-0451524935");
        Libro libro4 = new Libro("El Principito", "Antoine de Saint-Exupéry", "978-0156012195");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);

        biblioteca.listarTodosLosLibros();

        biblioteca.listarLibrosDisponibles();

        System.out.println("\n>>> PRÉSTAMOS DE LIBROS <<<\n");
        biblioteca.prestarLibro("978-0307474728"); // Cien Años de Soledad
        biblioteca.prestarLibro("978-8424936464"); // Don Quijote

        System.out.println();
        biblioteca.prestarLibro("978-0307474728"); // Ya está prestado

        biblioteca.listarLibrosDisponibles();

        System.out.println("\n>>> BÚSQUEDA DE LIBROS <<<\n");
        biblioteca.buscarLibro("1984");
        System.out.println();
        biblioteca.buscarLibro("Harry Potter"); // No existe

        System.out.println("\n>>> DEVOLUCIÓN DE LIBROS <<<\n");
        biblioteca.devolverLibro("978-0307474728"); // Cien Años de Soledad


        System.out.println();
        biblioteca.devolverLibro("978-0451524935"); // 1984 (no estaba prestado)

        biblioteca.listarLibrosDisponibles();

        biblioteca.listarTodosLosLibros();
    }
}