package w5;

public class EmpleadoComision extends Empleado {
    private double ventasRealizadas;
    private double porcentajeComision;

    public EmpleadoComision(String nombre, String identificacion, double salarioBase,
                            double ventasRealizadas, double porcentajeComision) {
        super(nombre, identificacion, salarioBase);
        this.ventasRealizadas = ventasRealizadas;
        this.porcentajeComision = porcentajeComision;
    }

    public double getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(double ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSalario() {
        // Salario = salarioBase + (ventasRealizadas * porcentajeComision)
        return salarioBase + (ventasRealizadas * porcentajeComision);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== EMPLEADO POR COMISIÓN ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Salario Base: $" + String.format("%.2f", salarioBase));
        System.out.println("Ventas Realizadas: $" + String.format("%.2f", ventasRealizadas));
        System.out.println("Porcentaje Comisión: " + (porcentajeComision * 100) + "%");
        System.out.println("Comisión Ganada: $" + String.format("%.2f", ventasRealizadas * porcentajeComision));
        System.out.println("Salario Total: $" + String.format("%.2f", calcularSalario()));
        System.out.println("==============================");
    }
}