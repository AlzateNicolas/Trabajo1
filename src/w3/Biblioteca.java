package w3;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("✓ Libro agregado: " + libro.getTitulo());
    }

    public void prestarLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                if (libro.isDisponible()) {
                    libro.setDisponible(false);
                    System.out.println("✓ Libro prestado: " + libro.getTitulo());
                    return;
                } else {
                    System.out.println("✗ El libro ya está prestado: " + libro.getTitulo());
                    return;
                }
            }
        }
        System.out.println("✗ No se encontró un libro con ISBN: " + isbn);
    }

    public void devolverLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                if (!libro.isDisponible()) {
                    libro.setDisponible(true);
                    System.out.println("✓ Libro devuelto: " + libro.getTitulo());
                    return;
                } else {
                    System.out.println("✗ El libro no estaba prestado: " + libro.getTitulo());
                    return;
                }
            }
        }
        System.out.println("✗ No se encontró un libro con ISBN: " + isbn);
    }

    public Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("✓ Libro encontrado:");
                libro.mostrarInformacion();
                return libro;
            }
        }
        System.out.println("✗ No se encontró un libro con el título: " + titulo);
        return null;
    }

    public void listarLibrosDisponibles() {
        System.out.println("\n=== LIBROS DISPONIBLES EN " + nombre.toUpperCase() + " ===");
        boolean hayDisponibles = false;

        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                libro.mostrarInformacion();
                hayDisponibles = true;
            }
        }

        if (!hayDisponibles) {
            System.out.println("No hay libros disponibles en este momento.");
        }
        System.out.println("========================================\n");
    }

    public void listarTodosLosLibros() {
        System.out.println("\n=== CATÁLOGO COMPLETO DE " + nombre.toUpperCase() + " ===");
        if (libros.isEmpty()) {
            System.out.println("La biblioteca no tiene libros registrados.");
        } else {
            for (Libro libro : libros) {
                libro.mostrarInformacion();
            }
        }
        System.out.println("==========================================\n");
    }
}