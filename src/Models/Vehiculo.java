package Models;

// Clase abstracta Vehiculo que sirve como base para todos los vehículos
public abstract class Vehiculo {
    // Atributos comunes a todos los vehículos
    protected String marca;
    protected String modelo;

    // Constructor que inicializa los atributos
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método abstracto: obliga a las subclases a implementar cómo se mueven
    public abstract void mover();

    // Método concreto: muestra la información del vehículo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
