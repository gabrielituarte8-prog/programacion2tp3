
package Ejercicio2;

public class PlanBasico extends suscripcion {

    public PlanBasico(String email, String numCliente, double costoBase) {
        super(email, numCliente, costoBase);
    }

    @Override
    public double calcularCostoMensual() {
        return getCostoBase();
    }
}