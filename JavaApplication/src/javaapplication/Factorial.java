package javaapplication;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        // el contador y el factorial
        int i = 1;
        long factorial = 1;

    
        do {
            factorial *= i; 
            System.out.println("El factorial de " + i + " es: " + factorial);
            i++;
        } while (i <= 20); 
    }
}
