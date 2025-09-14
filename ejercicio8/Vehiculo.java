package ejercicio8;

public abstract class Vehiculo {
    private int velocidad;

    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() { return velocidad; }
    public void setVelocidad(int velocidad) { this.velocidad = velocidad; }

    public abstract void mover();
}
