import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ExercicioDesafio2 {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=1; i<7; i++)
            list.add(i);
        Collections.shuffle(list);

        int sorteio1 = list.get(0);
        int sorteio2 = list.get(1);
        int sorteio3 = list.get(2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione um número entre 1 e 6:");
        int selecionado = sc.nextInt();

        int acertos = 0;
        if (sorteio1 == selecionado) {
            acertos++;
        }
        if (sorteio2 == selecionado) {
            acertos++;
        }
        if (sorteio3 == selecionado) {
            acertos++;
        }

        System.out.printf("O número selecionado foi o %d.\n", selecionado);
        System.out.printf("Os números sorteados foram o %d, %d, e %d.\n", sorteio1, sorteio2, sorteio3);
        if (acertos == 1) {
            System.out.println("Você teve um acerto!");
        }
        else if (acertos == 2) {
            System.out.println("Você teve dois acertos!");
        }
        else if (acertos == 3) {
            System.out.println("Você teve três acertos!");
        }
        else {
            System.out.println("Você teve nenhum acerto!");
        }
    }
}