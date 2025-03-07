package javaapplication;

import java.util.Scanner;

public class Enteros {
    public static void main(String[] args) {

        // Crear el objeto Scanner

        Scanner scanner = new Scanner(System.in);

        //Pedir el input 1 al usuario

        System.out.println("Ingrese el primer numero : ");

        float primero = scanner.nextFloat();

        //Pedir el input 2 al usuario

        System.out.println("Ingrese el primer numero : ");

        float segundo = scanner.nextFloat();

        //Salidas posibles segun ejercitario


        //variables de salida

        float salida;
        String salidaString;
        String condicion;


        //condicionales con la operacion y el print del output

        if (primero == segundo) {
            
            condicion = "El primero es igual al segundo, se multiplican";
            salida = primero * segundo;

            System.out.println(condicion);
            System.out.println(salida);
        }


        if (primero > segundo) {
            
            condicion = "El primero es mayor al segundo, se dividen";
            salida = primero / segundo;

            System.out.println(condicion);
            System.out.println(salida);
        }

        if (primero < segundo) {

            condicion = "El primero es menor al segundo, suma y resta";
            salidaString = "suma : " + (primero + segundo) + " resta : " + (primero - segundo) ;

            System.out.println(condicion);
            System.out.println(salidaString);

        }

        scanner.close();


    }
}
