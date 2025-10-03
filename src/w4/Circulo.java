package w4;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        // Área = π * r²
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        // Perímetro = 2 * π * r
        return 2 * Math.PI * radio;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Radio: " + radio);
        System.out.println("Área: " + String.format("%.2f", calcularArea()));
        System.out.println("Perímetro: " + String.format("%.2f", calcularPerimetro()));
        System.out.println("==================");
    }
}