package javaapplication;
import java.util.Scanner;

public class ProductoImpar {
    public static void main(String[] args) {

        int res = 1;

        for(int i = 1; i < 16; i++){

            if (i % 2 != 0) {
                res *= i;
            }
            
        }

        System.out.println("El producto entre los enteros impares del a1 al 15 es : " + res);
        
    }
}
