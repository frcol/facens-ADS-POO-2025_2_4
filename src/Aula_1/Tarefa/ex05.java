package Aula_1.Tarefa;

/*
Construir um programa em java que leia o ano 
de nascimento de João e o ano atual, calcule e 
mostre:
    Quantos anos João tem
    Quantos anos João terá em 2016
 */
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        int anoNasc, anoAtual, anoFuturo, idadeAtual, idadeFutura;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o ano de nascimento: ");
        anoNasc = entrada.nextInt();

        System.out.println("Qual o ano atual: ");
        anoAtual = entrada.nextInt();

        System.out.println("Qual o ano futuro: ");
        anoFuturo = entrada.nextInt();

        idadeAtual = anoAtual - anoNasc;
        idadeFutura = anoFuturo - anoNasc;

        System.out.println("Idade atual: " + idadeAtual);
        System.out.println("Idade em " + anoFuturo + ": " + idadeFutura);
    }
}
