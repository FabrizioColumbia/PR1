package javaapplication;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int mayor = 0;

        
        for (int i = 1; i <= 10; i++) {

            System.out.println("Ingrese el numero " + i + " :");
          
            int n = scanner.nextInt();
        
            if (n > mayor || mayor == 0) {
            
                mayor = n;
               
            }
             

        }

        System.out.println(mayor);
        
        scanner.close();
    }
}

