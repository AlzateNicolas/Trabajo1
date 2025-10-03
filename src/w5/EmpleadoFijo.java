package w5;

public class EmpleadoFijo extends Empleado {
    private double bonificacion;

    public EmpleadoFijo(String nombre, String identificacion, double salarioBase, double bonificacion) {
        super(nombre, identificacion, salarioBase);
        this.bonificacion = bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalario() {
        // Salario = salarioBase + bonificacion
        return salarioBase + bonificacion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== EMPLEADO FIJO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Salario Base: $" + String.format("%.2f", salarioBase));
        System.out.println("Bonificación: $" + String.format("%.2f", bonificacion));
        System.out.println("Salario Total: $" + String.format("%.2f", calcularSalario()));
        System.out.println("=====================");
    }
}