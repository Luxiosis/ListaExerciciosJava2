import java.util.Scanner;

public class Exercicio3 {
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

        if ((idade < 18 || idade > 65)) {
            System.out.printf("A pessoa que está solicitando o empréstimo tem %.0f anos de idade e tem o salário de %.1f reais.\n", idade, renda);
            System.out.printf("O valor solicitado é de %.1f reais para ser pago em %.0f parcelas.\n", emprestimo, parcelas);
            System.out.println("O empréstimo foi reprovado");
        } else if ((parcelas < 3) || (parcelas > 24)) {
            System.out.printf("A pessoa que está solicitando o empréstimo tem %.0f anos de idade e tem o salário de %.1f reais.\n", idade, renda);
            System.out.printf("O valor solicitado é de %.1f reais para ser pago em %.0f parcelas.\n", emprestimo, parcelas);
            System.out.println("O empréstimo foi reprovado");
        } else if (trinta_porcento < unica_parcela){
            System.out.printf("A pessoa que está solicitando o empréstimo tem %.0f anos de idade e tem o salário de %.1f reais.\n", idade, renda);
            System.out.printf("O valor solicitado é de %.1f reais para ser pago em %.0f parcelas.\n", emprestimo, parcelas);
            System.out.println("O empréstimo foi reprovado");
        } else {
            System.out.printf("A pessoa que está solicitando o empréstimo tem %.0f anos de idade e tem o salário de %.1f reais.\n", idade, renda);
            System.out.printf("O valor solicitado é de %.1f reais para ser pago em %.0f parcelas.\n", emprestimo, parcelas);
            System.out.println("O empréstimo foi aprovado");
        }
    }
}