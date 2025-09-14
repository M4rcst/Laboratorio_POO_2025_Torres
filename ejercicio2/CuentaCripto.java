package ejercicio2;

public class CuentaCripto extends Cuenta {
    private String claveBlockchain;
    private double comision = 0.02; // 2% comisión

    public CuentaCripto(String numeroCuenta, double saldo, String claveBlockchain) {
        super(numeroCuenta, saldo);
        this.claveBlockchain = claveBlockchain;
    }

    @Override
    public boolean realizarExtraccion(double monto) {
        double total = monto + (monto * comision);
        if (total <= getSaldo()) {
            setSaldo(getSaldo() - total);
            return true;
        }
        return false;
    }
}
