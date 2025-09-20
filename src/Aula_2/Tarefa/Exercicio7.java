package Aula_2.Tarefa;

/*
Exercício 7: Média de uma lista de números
Escreva uma função chamada calculaMedia que receba um array de números inteiros e retorne a média aritmética dos números.
Instruções:
? A função deve percorrer o array e calcular a soma de todos os números.
? A média é obtida dividindo a soma pelo número de elementos no array.
? Entrada: Um array de números inteiros.
? Saída: Um número representando a média dos elementos.
 */
public class Exercicio7 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        double media = calculaMedia(numeros);
        System.out.println("A média dos números é: " + media);
    }

    public static double calculaMedia(int[] array) {
        if (array.length == 0) {
            return 0; // Evita divisão por zero se o array estiver vazio
        }

        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }

        return (double) soma / array.length;
    }
}
