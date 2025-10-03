package w4;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super("Rectángulo");
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        // Área = base * altura
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        // Perímetro = 2 * (base + altura)
        return 2 * (base + altura);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + String.format("%.2f", calcularArea()));
        System.out.println("Perímetro: " + String.format("%.2f", calcularPerimetro()));
        System.out.println("==================");
    }
}