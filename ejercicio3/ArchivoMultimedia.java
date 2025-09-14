package ejercicio3;

public abstract class ArchivoMultimedia {
    private String nombre;
    private double duracion;

    public ArchivoMultimedia(String nombre, double duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getDuracion() { return duracion; }
    public void setDuracion(double duracion) { this.duracion = duracion; }

    public abstract void reproducir();
}
