package aula9;

import java.util.Scanner;

public class CauculoCongustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      double litrosGazolina = 0.0;
       double litrosAlcool = 0.0;
        System.out.printf("informe o tipo de congustível que deseja comprar. G para gazolina ou A, para álcool.");
char congustivel = sc.next().charAt(0);
if(congustivel == 'g'){
    System.out.printf("\n Agora, informe quantos litros de gazolina deseja comprar:");
litrosGazolina = sc.nextDouble();
} else if(congustivel == 'a'){
    System.out.printf("\n Agora, informe quantos litros de álcool deseja comprar: ");
    litrosAlcool = sc.nextDouble();
} else {
    System.out.printf("valor incorreto. Por favor informe a opção de congustível solicitada a cima.");
}
double precoGazolina = litrosGazolina * 2.50;
double precoAlcool = litrosAlcool * 1.90;
double gazolinaDesconto01 = (0.4*precoGazolina);
double descontoGazolina02 = (0.6*precoGazolina);

if(congustivel == 'a'){
    System.out.printf("\n Preço do álcool: %.2f \n", precoAlcool);
} else if(congustivel == 'g' && congustivel <= 20){
    System.out.printf("\n Preço da gazolina: %.2f \n ", gazolinaDesconto01);
} else if(congustivel == 'g' && congustivel > 20){
    System.out.printf("\n Preço da gazolina: %.2f \n ", descontoGazolina02);
        }
    }
}
