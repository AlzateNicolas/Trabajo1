package w5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        System.out.println(">>> SISTEMA DE GESTIÓN DE EMPLEADOS <<<\n");

        EmpleadoPorHoras empleado1 = new EmpleadoPorHoras(
                "Carlos Rodríguez",
                "1001",
                0,
                160,
                15000
        );

        EmpleadoPorHoras empleado2 = new EmpleadoPorHoras(
                "Ana López",
                "1002",
                0,
                120,
                18000
        );

        EmpleadoFijo empleado3 = new EmpleadoFijo(
                "Pedro Martínez",
                "2001",
                3000000,
                500000
        );

        EmpleadoFijo empleado4 = new EmpleadoFijo(
                "Laura García",
                "2002",
                3500000,
                800000
        );

        EmpleadoComision empleado5 = new EmpleadoComision(
                "Juan Pérez",
                "3001",
                2000000,
                15000000,
                0.05
        );

        EmpleadoComision empleado6 = new EmpleadoComision(
                "María Sánchez",
                "3002",
                2500000,
                25000000,
                0.07
        );

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);
        empleados.add(empleado5);
        empleados.add(empleado6);

        System.out.println(">>> INFORMACIÓN DE TODOS LOS EMPLEADOS <<<\n");
        for (Empleado emp : empleados) {
            emp.mostrarInformacion();
            System.out.println();
        }

        double nominaTotal = 0;
        System.out.println(">>> CÁLCULO DE NÓMINA TOTAL <<<\n");

        for (Empleado emp : empleados) {
            double salario = emp.calcularSalario();
            System.out.println(emp.getNombre() + " - Salario: $" + String.format("%.2f", salario));
            nominaTotal += salario;
        }

        System.out.println("\n" + "=".repeat(50));
        System.out.println("NÓMINA TOTAL DE LA EMPRESA: $" + String.format("%.2f", nominaTotal));
        System.out.println("=".repeat(50));

        System.out.println("\n>>> ESTADÍSTICAS POR TIPO DE EMPLEADO <<<\n");

        int empleadosPorHoras = 0;
        int empleadosFijos = 0;
        int empleadosComision = 0;
        double totalPorHoras = 0;
        double totalFijos = 0;
        double totalComision = 0;

        for (Empleado emp : empleados) {
            if (emp instanceof EmpleadoPorHoras) {
                empleadosPorHoras++;
                totalPorHoras += emp.calcularSalario();
            } else if (emp instanceof EmpleadoFijo) {
                empleadosFijos++;
                totalFijos += emp.calcularSalario();
            } else if (emp instanceof EmpleadoComision) {
                empleadosComision++;
                totalComision += emp.calcularSalario();
            }
        }

        System.out.println("Total de empleados: " + empleados.size());
        System.out.println("\nEmpleados por Horas: " + empleadosPorHoras);
        System.out.println("  Total pagado: $" + String.format("%.2f", totalPorHoras));
        System.out.println("  Promedio: $" + String.format("%.2f",
                empleadosPorHoras > 0 ? totalPorHoras / empleadosPorHoras : 0));

        System.out.println("\nEmpleados Fijos: " + empleadosFijos);
        System.out.println("  Total pagado: $" + String.format("%.2f", totalFijos));
        System.out.println("  Promedio: $" + String.format("%.2f",
                empleadosFijos > 0 ? totalFijos / empleadosFijos : 0));

        System.out.println("\nEmpleados por Comisión: " + empleadosComision);
        System.out.println("  Total pagado: $" + String.format("%.2f", totalComision));
        System.out.println("  Promedio: $" + String.format("%.2f",
                empleadosComision > 0 ? totalComision / empleadosComision : 0));

        System.out.println("\n>>> EMPLEADO CON MAYOR SALARIO <<<\n");
        Empleado empleadoMayorSalario = empleados.get(0);
        for (Empleado emp : empleados) {
            if (emp.calcularSalario() > empleadoMayorSalario.calcularSalario()) {
                empleadoMayorSalario = emp;
            }
        }
        empleadoMayorSalario.mostrarInformacion();
    }
}