package ejercicio1;

public class Libro extends Publicacion {
    public Libro(String titulo, String autor, String codigo) {
        super(titulo, autor, codigo);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Libro: " + getTitulo() + " - Autor: " + getAutor() + " - Código: " + getCodigo());
    }
}
