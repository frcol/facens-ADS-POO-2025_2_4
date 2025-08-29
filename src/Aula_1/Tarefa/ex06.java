package Aula_1.Tarefa;

/*
Sabe-se que 1 quilowatt de energia custa 1/500 avos 
do salário mínimo. Faça um algoritmo que receba o 
valor do salário mínimo e a quantidade de quilowatts 
consumida por uma residência. Calcule e mostre:
    A. O valor, em reais, de cada quilowatt;
    B. O valor, em reais, a ser pago por essa residência
    C. O valor, em reais, a ser pago com desconto de 15%
 */
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        double salario, consumo, custoQuilowatt, custoTotal, custoTotalDesconto;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual e a quantidade (em quilowatts) consumida? ");
        consumo = entrada.nextDouble();

        System.out.println("Qual e o valor do salario mi­nimo? ");
        salario = entrada.nextDouble();

        custoQuilowatt = salario * (1.0 / 500.0);
        custoTotal = custoQuilowatt * consumo;
        custoTotalDesconto = custoTotal - (custoTotal * (15.0 / 100.0));

        System.out.println("Valor de cada quilowatt: " + custoQuilowatt);
        System.out.println("Custo total na residÃªncia: " + custoTotal);
        System.out.println("Custo total com desconto: " + custoTotalDesconto);
    }
}
