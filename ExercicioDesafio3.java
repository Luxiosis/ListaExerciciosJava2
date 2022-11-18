import java.util.Scanner;

public class ExercicioDesafio3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        double idade = sc.nextDouble();
        System.out.println("Digite o número de parcelas:");
        double parcelas = sc.nextDouble();
        System.out.println("Digite o valor do empréstimo");
        double emprestimo = sc.nextDouble();
        System.out.println("Digite sua renda mensal:");
        double renda = sc.nextDouble();

        double unica_parcela = emprestimo / parcelas;
        double trinta_porcento = (renda / 100) * 30;
        double corresponde = (unica_parcela / renda) * 100;

        System.out.printf("A pessoa que está solicitando o empréstimo tem %.0f anos de idade e tem o salário de %.1f reais.\n", idade, renda);
        System.out.printf("O valor solicitado é de %.1f reais para ser pago em %.0f parcelas.\n", emprestimo, parcelas);
        if ((idade < 18 || idade > 65)) {
            System.out.println("O empréstimo foi reprovado pelos seguintes motivos:");
        } else if ((parcelas < 3) || (parcelas > 24)) {
            System.out.println("O empréstimo foi reprovado pelos seguintes motivos:");
        } else if (trinta_porcento < unica_parcela){
            System.out.println("O empréstimo foi reprovado pelos seguintes motivos:");
        }

        if (idade < 18) {
            System.out.println("- a idade não pode ser menor que 18 anos.");
        }
        if (idade > 65) {
            System.out.println("- a idade não pode ser maior que 65 anos.");
        }
        if (parcelas < 3) {
            System.out.println("- a quantidade de parcelas não pode ser inferior a 3.");
        }
        if (parcelas > 24) {
            System.out.println("- a quantidade de parcelas não pode ser superior a 24.");
        }
        if (trinta_porcento < unica_parcela) {
            System.out.println("- o valor da parcela desse empréstimo é de " + unica_parcela + " reais, e corresponde a " + corresponde + "% da renda da pessoa. Esse valor não pode ser superior a 30%");
        }

    }
}
