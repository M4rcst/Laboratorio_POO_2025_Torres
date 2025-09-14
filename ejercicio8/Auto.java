package ejercicio8;

public class Auto extends Vehiculo {
    public Auto(int velocidad) {
        super(velocidad);
    }

    @Override
    public void mover() {
        System.out.println("El auto se mueve a " + getVelocidad() + " km/h");
    }
}
