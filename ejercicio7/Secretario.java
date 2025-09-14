package ejercicio7;

public class Secretario extends Empleado {
    public Secretario(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSueldo() {
        return getSalarioBase(); // sin extra
    }
}
