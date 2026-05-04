package Ejercicio5;

public abstract class SeresVivos extends EntidadEspacial {
    private int puntosDeVida;

    public SeresVivos(double var1, double var3, int var5) {
        super(var1, var3);
        this.puntosDeVida = var5;
    }

    public SeresVivos() {
        super();
    }

    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }

    public void recibirDanio(int var1) {
        this.puntosDeVida -= var1;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0;
        }

        System.out.println(this.getNombre() + " recibió " + var1 + " de daño. Vida restante: " + this.puntosDeVida);
    }

    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }
}

