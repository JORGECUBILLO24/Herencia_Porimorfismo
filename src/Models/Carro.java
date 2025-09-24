package Models;

// La clase Carro hereda de Vehiculo e implementa la interfaz Combustible
public class Carro extends Vehiculo implements Combustible {

    // Constructor que llama al constructor de Vehiculo
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    // Implementación del método abstracto mover()
    @Override
    public void mover() {
        System.out.println("🚗 El carro avanza por la carretera.");
    }

    // Implementación del método recargar() de la interfaz Combustible
    @Override
    public void recargar() {
        System.out.println("⛽ El carro recarga gasolina en la estación.");
    }
}
