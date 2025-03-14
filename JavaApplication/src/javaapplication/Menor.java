package javaapplication;

import java.util.Scanner;

public class Menor {
    public static void main(String[] args) {

        // Crear el objeto Scanner

        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int menor = 0;

        int n = 0;
        int c = 0;

        boolean continuar = true;


        System.out.println("Ingrese los numeros a introducir : ");

        n = scanner.nextInt();
        
        while (continuar) {
            
            c++;

            // Pedir n

            System.out.println("Ingrese el valor del numero " + c + " :");

            numero = scanner.nextInt();

            if (numero<menor) {
                menor = numero;
            }

            if (c == n) {
                continuar = false;
            }


        }

        System.out.println("El numero menor es " + menor);
        scanner.close();

    
    }
}
