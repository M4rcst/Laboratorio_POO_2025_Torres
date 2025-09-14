package ejercicio1;

public class Revista extends Publicacion {
    private int numeroEdicion;

    public Revista(String titulo, String autor, String codigo, int numeroEdicion) {
        super(titulo, autor, codigo);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Revista: " + getTitulo() + " - Edición Nº" + numeroEdicion);
    }
}
