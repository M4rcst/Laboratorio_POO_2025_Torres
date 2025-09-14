package ejercicio7;

public class Tecnico extends Empleado {
    private double horasExtras;
    private double valorHora;

    public Tecnico(String nombre, double salarioBase, double horasExtras, double valorHora) {
        super(nombre, salarioBase);
        this.horasExtras = horasExtras;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return getSalarioBase() + (horasExtras * valorHora);
    }
}
