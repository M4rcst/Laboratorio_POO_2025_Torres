package ejercicio8;

public class Camion extends Vehiculo {
    public Camion(int velocidad) {
        super(velocidad);
    }

    @Override
    public void mover() {
        System.out.println("El camión se mueve a " + getVelocidad() + " km/h");
    }
}
