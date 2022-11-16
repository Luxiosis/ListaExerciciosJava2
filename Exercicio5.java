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
        } else if (salario > 3641.04 && salario <= 7087.22) {
            System.out.printf("O salário bruto informado foi %.2f reais.\n", salario);
            double tarifa_custom = ((salario - 3641.04) / 100) * 14;
            double contribuir = tarifa_lvl1 + tarifa_lvl2 + tarifa_lvl3 + tarifa_custom;
            System.out.printf("O valor de contribuição ao INSS é %.2f reais.", contribuir);
        } else if (salario > 2427.36 && salario <= 3641.03) {
            System.out.printf("O salário bruto informado foi %.2f reais.\n", salario);
            double tarifa_custom = ((salario - 2427.36) / 100) * 12;
            double contribuir = tarifa_lvl1 + tarifa_lvl2 + tarifa_custom;
            System.out.printf("O valor de contribuição ao INSS é %.2f reais.", contribuir);
        } else if (salario > 1212.01 && salario <= 2427.35) {
            System.out.printf("O salário bruto informado foi %.2f reais.\n", salario);
            double tarifa_custom = ((salario - 1212.01) / 100) * 9;
            double contribuir = tarifa_lvl1 + tarifa_custom;
            System.out.printf("O valor de contribuição ao INSS é %.2f reais.", contribuir);
        } else {
            System.out.printf("O salário bruto informado foi %.2f reais.\n", salario);
            double contribuir = (salario  / 100) * 7.5;
            System.out.printf("O valor de contribuição ao INSS é %.2f reais.", contribuir);
        }
    }
}
