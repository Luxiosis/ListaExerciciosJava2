import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String args[]) {
        Random ran = new Random();
        int sorteio = ran.nextInt(6) + 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione um número entre 1 e 6:");
        int selecionado = sc.nextInt();

        System.out.printf("O número selecionado foi o %d.\n", selecionado);
        System.out.printf("O número sorteado foi o %d.\n", sorteio);
        if (selecionado > 6 || selecionado < 1) {
            System.out.println("Erro! Por favor, escolha um número entre 1 e 6.");
        } else if (selecionado == sorteio) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você errou!");
        }
    }
}
