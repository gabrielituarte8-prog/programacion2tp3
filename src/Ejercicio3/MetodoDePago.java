package Ejercicio3;

interface Validable {
    boolean validarConexion();
}

interface Procesable {
    void procesarPago(double monto);
}

abstract class MetodoDePAgo implements Procesable, Validable {
    protected  String nombrePlataforma;

    public MetodoDePAgo(String nombrePlataforma) {
        this.nombrePlataforma = nombrePlataforma;
    }

    public void mostrarCabecera() {
        IO.println("\n--- Iniciando Pago Via: " + nombrePlataforma + " ---");
    }
}