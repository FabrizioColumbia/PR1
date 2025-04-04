
import java.util.Scanner;

public class Triangulo {

    public static double hipotenusa(double lado1, double lado2) {
        return Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nIngrese la cantidad de triángulos para calcular su hipotenusa:\n" 
                                                        );
        int cantidadTriangulos = scanner.nextInt();

        for (int i = 1; i <= cantidadTriangulos; i++) {
            System.out.println("\nTriángulo " + i);
            System.out.println("**********");

            System.out.print("Escriba longitud lado 1: ");
            double lado1 = scanner.nextDouble();

            System.out.print("Escriba longitud lado 2: ");
            double lado2 = scanner.nextDouble();

            double hipotenusa = hipotenusa(lado1, lado2);
            System.out.println("La hipotenusa del triángulo es: " + String.format("%.2f", hipotenusa));
        }

        scanner.close();
    }
}