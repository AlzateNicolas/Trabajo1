package w2;

public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso de $" + monto);
            System.out.println("Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Error: El monto a depositar debe ser mayor a 0");
        }
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto a retirar debe ser mayor a 0");
        } else if (monto > saldo) {
            System.out.println("Error: Saldo insuficiente");
            System.out.println("Saldo disponible: $" + saldo);
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso de $" + monto);
            System.out.println("Nuevo saldo: $" + saldo);
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
    public void transferir(CuentaBancaria destino, double monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto a transferir debe ser mayor a 0");
        } else if (monto > saldo) {
            System.out.println("Error: Saldo insuficiente para la transferencia");
            System.out.println("Saldo disponible: $" + saldo);
        } else {
            saldo -= monto;
            destino.saldo += monto;
            System.out.println("Transferencia exitosa de $" + monto);
            System.out.println("Desde: " + titular + " (Cuenta: " + numeroCuenta + ")");
            System.out.println("Hacia: " + destino.titular + " (Cuenta: " + destino.numeroCuenta + ")");
            System.out.println("Nuevo saldo: $" + saldo);
        }
    }

    public void mostrarInformacion() {
        System.out.println("=== Información de la Cuenta ===");
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
        System.out.println("================================");
    }
}