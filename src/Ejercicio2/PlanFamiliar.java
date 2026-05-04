package Ejercicio2;

public class PlanFamiliar extends suscripcion {
    private int perfilesAdicionales;

    public PlanFamiliar(String email, String numCliente, double costoBase, int perfiles) {
        super(email, numCliente, costoBase);
        this.perfilesAdicionales = perfiles;
    }

    @Override
    public double calcularCostoMensual() {
        double recargo = perfilesAdicionales * 500; // podés cambiar el valor
        double v = getCostoBase() + recargo;
        return v;
    }
}