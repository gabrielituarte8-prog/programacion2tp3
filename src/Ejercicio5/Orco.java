package Ejercicio5;

public class Orco extends MounstrosHostiles {
    public Orco(double x, double y) {

        super(x, y, 120);
    }

    @Override
    public String getNombre() { return "Orco"; }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " golpea brutalmente con su maza!");
    }
}
