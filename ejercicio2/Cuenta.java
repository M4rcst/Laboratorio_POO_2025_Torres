package ejercicio2;

public abstract class Cuenta {
    private double saldo;
    private String numeroCuenta;

    public Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public String getNumeroCuenta() { return numeroCuenta; }

    public abstract boolean realizarExtraccion(double monto);
}
