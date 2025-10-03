package w4;

public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public void mostrarInformacion() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Área: " + String.format("%.2f", calcularArea()));
        System.out.println("Perímetro: " + String.format("%.2f", calcularPerimetro()));
        System.out.println("==================");
    }

    public String getNombre() {
        return nombre;
    }
}