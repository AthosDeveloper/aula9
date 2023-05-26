package aula9;

import java.util.Scanner;

public class FolhaPagamento
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor da hora trabalhada.");
        double horaValor = sc.nextDouble();
        System.out.println("Agora, informe a quantidade de horas trabalhadas no mês.");
        double horaQuantidade = sc.nextDouble();
        double salarioBruto = horaValor * horaQuantidade;
        double ir = (0.05 * salarioBruto);
        double inss = (0.10 * salarioBruto) ;
        double fgts = (0.11 * salarioBruto);
        double totalDesconto = ir + inss;
        double salarioLiquido = salarioBruto - totalDesconto;
        System.out.printf("Salário bruto: %.2f \n ir: %.2f \n inss: %.2f \n fgts: %.2f \n Total de descontos: %.2f \n salário líquido: %.2f", salarioBruto, ir, inss, fgts, totalDesconto, salarioLiquido);
        if (salarioBruto <= 900) {
            double isencao = salarioBruto - inss;
            System.out.printf("\n Você está isento do desconto de imposto de renda e o valor a ser pago é de: \n %.2f ", isencao);
        } else if (salarioBruto <= 1500){
            double pegaDesconto = salarioLiquido;
            System.out.printf("\n seu salário com desconto é de: %.2f ", pegaDesconto);
        } else if (salarioBruto <=2500){
            double pegaDesconto = salarioLiquido - ir;
            System.out.printf("seu salário com desconto é de: \n %.2f", pegaDesconto);
        } else {
            double pegaDesconto = salarioLiquido - ir - ir - ir;
            System.out.printf("seu salário com desconto é de: \n %.2f", pegaDesconto);
        }
        sc.close();
}

}



