package Ejercicio4;

public class CamaraDeSeguridad extends DispositivoElectronico implements Camara {
    private double resolucionMP;

    public CamaraDeSeguridad(String nombre, double resolucionMP) {
        super(nombre);
        this.resolucionMP = resolucionMP;
    }

    @Override
    public void tomarFotografia() {
        System.out.println(getNombre() + " tomó una fotografía.");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("-CAMARA DE SEGURIDAD-");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Resolución: " + resolucionMP + " MP");
    }
}
