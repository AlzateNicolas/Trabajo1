package w5;

public class Empleado {
    protected String nombre;
    protected String identificacion;
    protected double salarioBase;

    public Empleado(String nombre, String identificacion, double salarioBase) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void mostrarInformacion() {
        System.out.println("=== INFORMACIÓN DEL EMPLEADO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Salario Base: $" + String.format("%.2f", salarioBase));
        System.out.println("Salario Total: $" + String.format("%.2f", calcularSalario()));
        System.out.println("=================================");
    }
}

