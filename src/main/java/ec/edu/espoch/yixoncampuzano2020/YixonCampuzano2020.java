/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.yixoncampuzano2020;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class YixonCampuzano2020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] ventas = new float[7];
        float totalVentas = 0;
        float ventasDiarias=0;

        int i = 0;

        do {
            System.out.println("Ingrese el monto de la venta");
            totalVentas = scanner.nextFloat();
            if (totalVentas > 0) {
                ventas[i] = totalVentas;
                i++;

            } else {
                System.out.println("El valor ingresado debe ser positivo");
            }
        } while (i < 7);
        // Menu principal
        System.out.println("Calcular total ventas");
        System.out.println("Calcular el dia con mas ventas");
        System.out.println("Mostrar el dia con venta mas alta");
        System.out.println("Calcular monto acumulado");
        System.out.println("Salir");

        int menu = scanner.nextInt();
        switch (menu) {
            case 1:
                System.out.println("El total de la venta de la semana"+totalVentas);
                break;
            case 2:
                
                 
    }
}
    }