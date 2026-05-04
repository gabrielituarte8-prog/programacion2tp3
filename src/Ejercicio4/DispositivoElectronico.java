package Ejercicio4;

public abstract class DispositivoElectronico {
    private String nombre;

    public DispositivoElectronico(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    public abstract void mostrarInfo();
}