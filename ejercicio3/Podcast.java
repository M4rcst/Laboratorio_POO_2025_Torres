package ejercicio3;

public class Podcast extends ArchivoMultimedia {
    private String episodio;

    public Podcast(String nombre, double duracion, String episodio) {
        super(nombre, duracion);
        this.episodio = episodio;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo podcast: " + getNombre() + " - Episodio: " + episodio);
    }
}
