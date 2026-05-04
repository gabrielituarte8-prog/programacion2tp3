package Ejercicio5;

public abstract class MounstrosHostiles extends SeresVivos {
    public MounstrosHostiles(double x, double y, int vida) {
        super(x, y, vida);
    }

    public abstract void atacar();

    @Override
    public void dibujar() {
        System.out.println("[MONSTRUO] Dibujando " + getNombre() + " en (" + getX() + "," + getY() + ")");
    }
}
