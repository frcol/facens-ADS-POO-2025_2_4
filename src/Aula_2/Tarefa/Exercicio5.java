package Aula_2.Tarefa;

/*
Exercício 5: Fatorial
Escreva uma função chamada calculaFatorial que receba um número inteiro como 
parâmetro e retorne o fatorial desse número.
 */
public class Exercicio5 {

    public static void main(String[] args) {
        int numero = 5;
        long resultado = calculaFatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);
    }

    public static long calculaFatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fatorial não é definido para números negativos.");
        }

        long fatorial = 1;
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
