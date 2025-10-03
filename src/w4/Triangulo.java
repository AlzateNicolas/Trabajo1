package w4;

public class Triangulo extends Figura {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        super("Triángulo");
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
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

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        // Área = (base * altura) / 2
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        // Perímetro = lado1 + lado2 + lado3
        return lado1 + lado2 + lado3;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== " + nombre + " ===");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Lados: " + lado1 + ", " + lado2 + ", " + lado3);
        System.out.println("Área: " + String.format("%.2f", calcularArea()));
        System.out.println("Perímetro: " + String.format("%.2f", calcularPerimetro()));
        System.out.println("==================");
    }
}