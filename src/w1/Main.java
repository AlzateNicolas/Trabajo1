package w1;

public class Main {
    public static void main(String[] args) {
        {

            Estudiante estudiante1 = new Estudiante("María González", 20, "Ingeniería de Sistemas", 4.2);
            Estudiante estudiante2 = new Estudiante("Carlos Pérez", 22, "Administración de Empresas", 2.8);

            estudiante1.mostrarInformacion();
            System.out.println();
            estudiante2.mostrarInformacion();

            System.out.println("\n--- Actualizando promedio de Carlos ---");
            estudiante2.setPromedio(3.5);
            estudiante2.mostrarInformacion();

            System.out.println("\nConsultando información específica:");
            System.out.println("Nombre: " + estudiante1.getNombre());
            System.out.println("¿Está aprobado? " + estudiante1.esAprobado());
        }

    }
}