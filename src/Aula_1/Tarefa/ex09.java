package Aula_1.Tarefa;

/*
Criar um algoritmo que leia o peso de uma 
pessoa, somente a parte inteira. Calcular e 
imprimir:
 O peso da pessoa em gramas
O novo peso, em gramas, se a pessoa engordar 12%
 */
import java.util.Scanner;

public class ex09 {

    public static void main(String[] args) {

        double pesoQuilo, pesoGrama, novoPeso;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu peso em Kg? ");
        pesoQuilo = entrada.nextDouble();

        pesoGrama = pesoQuilo * 1000;
        novoPeso = pesoGrama + (pesoGrama * 0.12);

        System.out.println("Peso em gramas: " + pesoGrama);
        System.out.println("Peso caso engorde 12%: " + novoPeso + " gramas");
    }
}
