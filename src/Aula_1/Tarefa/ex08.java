package Aula_1.Tarefa;

/*
Criar um algoritmo que efetue o cálculo do salário 
líquido de um professor. Os dados fornecidos serão: 
valor da hora aula, número de aulas dadas no mês e 
percentual de desconto do INSS.
 */
import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {
        double valorHora, qtdHoras, porcDesconto;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Valor da hora aula? ");
        valorHora = entrada.nextDouble();

        System.out.println("Quantidade de horas no mes? ");
        qtdHoras = entrada.nextInt();

        System.out.println("Porcentagem de desconto do INSS? ");
        porcDesconto = entrada.nextDouble();

        double salarioBruto = valorHora * qtdHoras;
        double salario = salarioBruto - (salarioBruto * (porcDesconto / 100));

        System.out.println("Salario li­quido: " + salario);

    }
}
