package ejercicio2;

public class CuentaCorriente extends Cuenta {
    private double limiteDescubierto;

    public CuentaCorriente(String numeroCuenta, double saldo, double limiteDescubierto) {
        super(numeroCuenta, saldo);
        this.limiteDescubierto = limiteDescubierto;
    }

    @Override
    public boolean realizarExtraccion(double monto) {
        if (monto <= getSaldo() + limiteDescubierto) {
            setSaldo(getSaldo() - monto);
            return true;
        }
        return false;
    }
}
