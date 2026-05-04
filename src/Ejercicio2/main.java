package Ejercicio2;
import java.util.ArrayList;
import java.util.List;

class Ejercicio2 {
    public static void main(String[] args) {
        List<suscripcion> lista = new ArrayList<>();

        lista.add(new PlanBasico("benja31@email.com", "C001", 1500));
        lista.add(new PlanFamiliar("alexa11@email.com", "C002", 2200, 3));
        lista.add(new PlanPremium("roman23@email.com", "C003", 2800));

        double total = 0;
        for (suscripcion s : lista) {
            s.mostrarDatos();
            double costo = s.calcularCostoMensual();
            System.out.println("Costo mensual: $" + costo + "\n");
            total += costo;
        }

        System.out.println("Ingresos totales del mes: $" + total);
    }
}