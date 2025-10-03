package w5;

public class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras(String nombre, String identificacion, double salarioBase,
                            double horasTrabajadas, double valorHora) {
        super(nombre, identificacion, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * valorHora;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== EMPLEADO POR HORAS ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificación: " + identificacion);
        System.out.println("Horas Trabajadas: " + horasTrabajadas);
        System.out.println("Valor por Hora: $" + String.format("%.2f", valorHora));
        System.out.println("Salario Total: $" + String.format("%.2f", calcularSalario()));
        System.out.println("==========================");
    }
}