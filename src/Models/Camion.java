package Models;

// La clase Camion hereda de Vehiculo e implementa Combustible
public class Camion extends Vehiculo implements Combustible {

    // Constructor que inicializa la marca y modelo
    public Camion(String marca, String modelo) {
        super(marca, modelo);
    }

    // Implementación del método abstracto mover()
    @Override
    public void mover() {
        System.out.println("🚚 El camión transporta carga pesada.");
    }

    // Implementación del método recargar() de la interfaz Combustible
    @Override
    public void recargar() {
        System.out.println("⛽ El camión recarga diésel.");
    }
}
