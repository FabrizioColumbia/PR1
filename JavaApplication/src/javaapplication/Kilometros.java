package javaapplication;

import java.util.Scanner;

public class Kilometros {
    public static void main(String[] args) {

        // Crear el objeto Scanner

        Scanner scanner = new Scanner(System.in);

        float  kilometros = 0;
        float litros = 0;
        boolean romper = false;
        String continuar = "";

        int c = 0;


        while(romper == false){ 

            c++;

           

            //Pedir el kilometraje

            System.out.println("Ingrese los kilometros viajados : ");

            kilometros += scanner.nextFloat();
            

            //Pedir los litros

            System.out.println("Ingrese los litros consumidos : ");

            litros += scanner.nextFloat();


            // promedio del viaje

            System.out.println("uso del viaje " + c + " :" + kilometros/litros + " km/L");



            // Continuar ciclo ?

            System.out.println("Desea seguir ? : ");

            continuar = scanner.next().toLowerCase();

            if (continuar.equals("s") ) {
                romper = false;
            }

            if (continuar.equals("n")) {
                romper = true;
                
            }

            if (!continuar.equals("s") && !continuar.equals("n")) {
                System.out.println("Opcion invalida destruyendo proceso");
                break;
            }
            
             


     
        }


        System.out.println("Kilometros : " + kilometros + " litros : " + litros + " uso total del viaje : " + kilometros/litros + " KM/L");
        scanner.close();


    }
}
