package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main() {
        List<DispositivoElectronico> dispositivos = new ArrayList<>();
        dispositivos.add(new CamaraDeSeguridad("Camara Seguridad 1", 8.0));
        dispositivos.add(new Termostato("Termostato Sala", 24));
        dispositivos.add(new Smartphone("Smartphone de Braiton", "Galaxy S23+"));

        System.out.println("-----------------------");
        System.out.println("REPORTE DE DISPOSITIVOS");
        System.out.println("-----------------------");
        System.out.println();

        for (DispositivoElectronico d : dispositivos) {
            d.mostrarInfo();
            System.out.println();
        }

        System.out.println("-----------------------------");
        System.out.println("CONECTANDO DISPOSITIVOS WIFI");
        System.out.println("-----------------------------");
        System.out.println();

        for (DispositivoElectronico d : dispositivos) {
            if (d instanceof ConectarRedWiFi) {
                ((ConectarRedWiFi) d).conectarseAWiFi("CasaInteligente");
            }
        }

        System.out.println();
        System.out.println("Total de dispositivos: " + dispositivos.size());
    }
}