package Ejercicio4;


public class Smartphone extends DispositivoElectronico implements Camara, ConectarRedWiFi {
    private String modelo;

    public Smartphone(String nombre, String modelo) {
        super(nombre);
        this.modelo = modelo;
    }

    @Override
    public void tomarFotografia() {
        System.out.println(getNombre() + " tomó una fotografía.");
    }

    @Override
    public void conectarseAWiFi(String nombreRed) {
        System.out.println(getNombre() + " conectado a la red: " + nombreRed);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("-SMARTPHONE-");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Modelo: " + modelo);
    }
}
