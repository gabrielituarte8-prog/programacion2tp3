package Ejercicio3;

import java.util.ArrayList;

public class main {
    void main() {
        ArrayList<MetodoDePAgo> historialPagos = new ArrayList<>();

        historialPagos.add (new TarjetaCredito());
        historialPagos.add (new PayPal());
        historialPagos.add  (new CriptoMoneda());

        IO.println("= Procesamiento Unificado de Pagos =");

        for (MetodoDePAgo pago : historialPagos) {
            pago.procesarPago(250.0);
        }
    }
}