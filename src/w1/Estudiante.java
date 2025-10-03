package w1;

public class Estudiante {

    private String nombre;
    private int edad;
    private String carrera;
    private double promedio;

    public Estudiante(String nombre, int edad, String carrera, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }


    public void mostrarInformacion() {
        System.out.println("=== Información del w1.Estudiante ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
        System.out.println("Estado: " + (esAprobado() ? "APROBADO" : "NO APROBADO"));
        System.out.println("==================================");
    }

    public boolean esAprobado() {
        return promedio >= 3.0;
    }
}