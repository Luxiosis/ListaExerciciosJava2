import java.util.Scanner;

public class Exercicio1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite nota 1:");
        double nota1 = sc.nextDouble();
        System.out.println("Digite nota 2:");
        double nota2 = sc.nextDouble();
        System.out.println("Digite nota 3:");
        double nota3 = sc.nextDouble();
        System.out.println("Digite nota 4:");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("As notas do aluno são: %.0f, %.0f, %.0f e %.0f.\n", nota1, nota2, nota3, nota4);
        System.out.printf("A média final é %.1f.\n", media);
        if (media >= 6.0) {
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno foi reprovado.");
        }
    }
}
