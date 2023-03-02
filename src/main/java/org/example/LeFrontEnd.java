package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LeFrontEnd {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digita la cantidad de producto: ");

        Integer cantidadProducto= entrada.nextInt();
        System.out.println("La cantidad fue " + cantidadProducto);
        //como obtener una fecha del sistem
        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);

        //como asignar una fecha en especifico
        LocalDate  fecha2 = LocalDate.of(2023,2,24);
        System.out.println(fecha2);

        //Encontrar la diferencia entre dos fechas
        Long diferenciaEntreFechas = ChronoUnit.DAYS.between(fecha,fecha2);
        System.out.println(diferenciaEntreFechas);
    }
}