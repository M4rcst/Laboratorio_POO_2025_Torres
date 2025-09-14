package ejercicio1;

public class Diario extends Publicacion {
    private String fecha;

    public Diario(String titulo, String autor, String codigo, String fecha) {
        super(titulo, autor, codigo);
        this.fecha = fecha;
    }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    @Override
    public void mostrarInformacion() {
        System.out.println("Diario: " + getTitulo() + " (" + fecha + ")");
    }
}
