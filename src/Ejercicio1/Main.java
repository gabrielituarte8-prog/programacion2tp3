package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Vehiculo> flota = new ArrayList<>();

        flota.add(new furgoneta("Mercedes","Spriter",120.0,1500.0));
        flota.add(new furgoneta("Ford","Transit",95.0,900.0));
        flota.add(new Motocicleta("Honda","CB500F",45.0,500));
        flota.add(new Motocicleta("Yamaha","MT-07",60,700));

        System.out.println("~*~*~*~*~*~*~*~*~*~");
        System.out.println("REPORTE DE FLOTA");
        System.out.println("~*~*~*~*~*~*~*~*~*~");
        System.out.println();

        for (Vehiculo vehiculos: flota){
            vehiculos.mostrarInfo();
            System.out.println();
        }
        System.out.println("Toral de Vehiculos: "+ flota.size());
    }
}