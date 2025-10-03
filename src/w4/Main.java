package w4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();

        System.out.println(">>> CREACIÓN DE FIGURAS GEOMÉTRICAS <<<\n");

        Circulo circulo1 = new Circulo(5.0);
        Circulo circulo2 = new Circulo(3.5);
        Rectangulo rectangulo1 = new Rectangulo(8.0, 4.0);
        Rectangulo rectangulo2 = new Rectangulo(6.0, 3.0);
        Triangulo triangulo1 = new Triangulo(6.0, 4.0, 5.0, 5.0, 6.0);
        Triangulo triangulo2 = new Triangulo(8.0, 5.0, 6.0, 7.0, 8.0);

        figuras.add(circulo1);
        figuras.add(circulo2);
        figuras.add(rectangulo1);
        figuras.add(rectangulo2);
        figuras.add(triangulo1);
        figuras.add(triangulo2);

        System.out.println(">>> INFORMACIÓN DE TODAS LAS FIGURAS <<<\n");
        for (Figura figura : figuras) {
            figura.mostrarInformacion();
            System.out.println();
        }

        double areaTotal = 0;
        System.out.println(">>> CÁLCULO DE ÁREA TOTAL <<<\n");

        for (Figura figura : figuras) {
            double area = figura.calcularArea();
            System.out.println(figura.getNombre() + " - Área: " + String.format("%.2f", area));
            areaTotal += area;
        }

        System.out.println("\n" + "=".repeat(40));
        System.out.println("ÁREA TOTAL DE TODAS LAS FIGURAS: " + String.format("%.2f", areaTotal));
        System.out.println("=".repeat(40));

        double perimetroTotal = 0;
        System.out.println("\n>>> CÁLCULO DE PERÍMETRO TOTAL <<<\n");

        for (Figura figura : figuras) {
            double perimetro = figura.calcularPerimetro();
            System.out.println(figura.getNombre() + " - Perímetro: " + String.format("%.2f", perimetro));
            perimetroTotal += perimetro;
        }

        System.out.println("\n" + "=".repeat(40));
        System.out.println("PERÍMETRO TOTAL DE TODAS LAS FIGURAS: " + String.format("%.2f", perimetroTotal));
        System.out.println("=".repeat(40));

        System.out.println("\n>>> ESTADÍSTICAS <<<\n");
        int circulos = 0, rectangulos = 0, triangulos = 0;

        for (Figura figura : figuras) {
            if (figura instanceof Circulo) {
                circulos++;
            } else if (figura instanceof Rectangulo) {
                rectangulos++;
            } else if (figura instanceof Triangulo) {
                triangulos++;
            }
        }

        System.out.println("Total de figuras: " + figuras.size());
        System.out.println("Círculos: " + circulos);
        System.out.println("Rectángulos: " + rectangulos);
        System.out.println("Triángulos: " + triangulos);
    }
}