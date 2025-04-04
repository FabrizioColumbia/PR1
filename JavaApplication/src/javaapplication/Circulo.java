import java.util.Scanner;

public class Circulo {

    public static double circuloArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double circuloPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIngrese la cantidad de círculos para calcular su área: \n");
        int cantidadCirculos = scanner.nextInt();

        for (int i = 1; i <= cantidadCirculos; i++) {
            System.out.println("\nEscriba radio del circulo " + i + ": ");
            double radio = scanner.nextDouble();

            double area = circuloArea(radio);
            double perimetro = circuloPerimetro(radio);

            System.out.println("El área del circulo es: " + String.format("%.2f", area));
            System.out.println("El perímetro del circulo es: " + String.format("%.2f", perimetro));
        }

        scanner.close();
    }
}
