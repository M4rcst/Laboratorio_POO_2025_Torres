package ejercicio2;

public class CajaAhorro extends Cuenta {
    public CajaAhorro(String numeroCuenta, double saldo) {
        super(numeroCuenta, saldo);
    }

    @Override
    public boolean realizarExtraccion(double monto) {
        if (monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
            return true;
        }
        return false;
    }
}
