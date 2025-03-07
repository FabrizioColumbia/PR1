/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FechaTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el dia : ");
        int dia = scanner.nextInt();

        System.out.println("Ingrese el mes : ");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el año : ");
        int año = scanner.nextInt();


        Fecha fecha = new Fecha(dia, mes, año);

        System.out.println("La fecha ingresada es : " + fecha.formatoFecha());

        scanner.close();
    }
    
}
