package ejercicio8;

public class Moto extends Vehiculo {
    public Moto(int velocidad) {
        super(velocidad);
    }

    @Override
    public void mover() {
        System.out.println("La moto se mueve a " + getVelocidad() + " km/h");
    }
}
