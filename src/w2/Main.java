package w2;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("001-123456", "Ana Rodríguez");
        CuentaBancaria cuenta2 = new CuentaBancaria("001-789012", "Luis Martínez");

        System.out.println(">>> CREACIÓN DE CUENTAS <<<");
        cuenta1.mostrarInformacion();
        System.out.println();
        cuenta2.mostrarInformacion();

        System.out.println("\n>>> DEPÓSITOS <<<");
        cuenta1.depositar(5000);
        System.out.println();
        cuenta2.depositar(3000);

        System.out.println("\n>>> CONSULTA DE SALDO <<<");
        System.out.println("Saldo de " + cuenta1.getTitular() + ": $" + cuenta1.consultarSaldo());
        System.out.println("Saldo de " + cuenta2.getTitular() + ": $" + cuenta2.consultarSaldo());

        System.out.println("\n>>> RETIROS <<<");
        cuenta1.retirar(1000);
        System.out.println();
        cuenta2.retirar(5000); // Intento de retiro con saldo insuficiente

        System.out.println("\n>>> TRANSFERENCIA <<<");
        cuenta1.transferir(cuenta2, 2000);

        System.out.println("\n>>> ESTADO FINAL DE LAS CUENTAS <<<");
        cuenta1.mostrarInformacion();
        System.out.println();
        cuenta2.mostrarInformacion();

        System.out.println("\n>>> INTENTO DE TRANSFERENCIA SIN SALDO <<<");
        cuenta1.transferir(cuenta2, 5000);
    }
}