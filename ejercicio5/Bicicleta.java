package ejercicio5;

public class Bicicleta extends Transporte {
    private int tamañoRuedas;

    public Bicicleta(int velocidad, int capacidad, String placa, int tamañoRuedas) {
        super(velocidad, capacidad, placa);
        this.tamañoRuedas = tamañoRuedas;
    }

    @Override
    public void mover() {
        System.out.println("La bicicleta con placa " + getPlaca() + " avanza con tracción humana. Tamaño ruedas: " + tamañoRuedas);
    }
}
