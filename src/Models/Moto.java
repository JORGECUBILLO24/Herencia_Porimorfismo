package Models;

// La clase Moto hereda de Vehiculo pero no implementa Combustible
// porque se decidió que solo Carro y Camion tengan ese comportamiento
public class Moto extends Vehiculo {

    // Constructor que llama al constructor de Vehiculo
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    // Implementación del método abstracto mover()
    @Override
    public void mover() {
        System.out.println("🏍️ La moto acelera rápidamente.");
    }
}
