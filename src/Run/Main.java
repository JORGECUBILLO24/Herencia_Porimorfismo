package Run;

import Models.*; // Importamos todas las clases del paquete Models

// Clase principal que contiene el método main
public class Main {
    public static void main(String[] args) {
        // Creamos un arreglo de Vehiculo con polimorfismo
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Carro("Toyota", "Hilux");
        vehiculos[1] = new Moto("Yamaha", "R15");
        vehiculos[2] = new Camion("Isuzu", "NLR 3 Ton");

        // Recorremos el arreglo y usamos polimorfismo para ejecutar métodos
        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();  // Método concreto de Vehiculo
            v.mover();        // Cada clase implementa mover() de forma distinta

            // Si el vehículo implementa la interfaz Combustible, lo recargamos
            if (v instanceof Combustible) {
                ((Combustible) v).recargar(); // Downcasting para usar el método de la interfaz
            }
            System.out.println("----------------------");
        }
    }
}
