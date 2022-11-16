import java.util.Scanner;

public class Exercicio5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sue salário: ");
        double salario = sc.nextDouble();

        double tarifa_lvl1 = 90.90;
        double tarifa_lvl2 = 109.38;
        double tarifa_lvl3 = 145.64;
        double tarifa_lvl4 = 482.46;

        if (salario > 7087.22) {
            System.out.printf("O salário bruto informado foi %.2f reais.\n", salario);
            double contribuir = tarifa_lvl1 + tarifa_lvl2 + tarifa_lvl3 + tarifa_lvl4;
            System.out.printf("O valor de contribuição ao INSS é %.2f reais.", contribuir);
        }
    }
}
