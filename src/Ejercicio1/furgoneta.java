package Ejercicio1;

public class furgoneta extends Vehiculo {
    private double capacidadCargaKg;

    public furgoneta(String marca, String modelo, double tarifaBase, double capacidadCargaKg) {
        super(marca, modelo, tarifaBase);
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public double getCapacidadCargaKg() { return capacidadCargaKg; }

    @Override
    public void mostrarInfo() {
        System.out.println("~*~ FURGONETA ~*~");
        System.out.println("Marca: "+ getMarca());
        System.out.println("Modelo: "+ getModelo());
        System.out.println("Tarifa:$ "+ getTarifaBase() +"/día");
        System.out.println("Carga: "+ capacidadCargaKg +" kg");
    }
}