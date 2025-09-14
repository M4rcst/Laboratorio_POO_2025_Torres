package ejercicio4;

public class Estudiante extends Usuario {
    private String cursoInscripto;

    public Estudiante(String nombre, String email, String password, String cursoInscripto) {
        super(nombre, email, password);
        this.cursoInscripto = cursoInscripto;
    }

    @Override
    public void acceder() {
        System.out.println("Acceso de Estudiante al curso: " + cursoInscripto);
    }
}
