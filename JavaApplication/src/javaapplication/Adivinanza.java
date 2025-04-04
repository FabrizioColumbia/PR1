import java.util.Random;
import java.util.Scanner;

public class Adivinanza {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio;
        int intento;
        int jugarDeNuevo;

        do {
            numeroAleatorio = random.nextInt(20) + 1;
            System.out.print("\nAdivine el número entre 1 y 20: \n");
            
            do {
                intento = scanner.nextInt();

                if (intento < numeroAleatorio) {
                    System.out.println("Demasiado bajo. Intente de nuevo");
                    System.out.print("Adivine el número entre 1 y 20: ");
                } else if (intento > numeroAleatorio) {
                    System.out.println("Demasiado alto. Intente de nuevo");
                    System.out.print("Adivine el número entre 1 y 20: ");
                } else {
                    System.out.println("Felicidades, adivinó el número!");
                }
            } while (intento != numeroAleatorio);

            System.out.print("Desea jugar otra vez? 1 = SI / 2 = NO: ");
            jugarDeNuevo = scanner.nextInt();

        } while (jugarDeNuevo == 1);

        scanner.close();
    }
}