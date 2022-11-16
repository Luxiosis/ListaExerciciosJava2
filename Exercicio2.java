import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira temperatura: ");
        double temperatura = sc.nextDouble();

        String nulo = sc.nextLine();

        System.out.println("Insira medida (F ou C)");
        String grandeza = sc.nextLine();

        if(grandeza.equals("F")) {
            System.out.printf("A temperatura informada foi %.1fº %s.\n", temperatura, grandeza);
            double resultado = ((temperatura - 32) * 5 ) / 9;
            System.out.printf("Ela equivale a %.0fº Celsius.", resultado);
        } else if(grandeza.equals("C")) {
            System.out.printf("A temperatura informada foi %.1fº %s.\n", temperatura, grandeza);
            double resultado = (temperatura * 1.8) + 32;
            System.out.printf("Ela equivale a %.0fº Fahrenheit.", resultado);
        } else {
            System.out.println("A letra " + grandeza + " não corresponde a uma unidade de medida de temperatura.");
        }

    }
}
