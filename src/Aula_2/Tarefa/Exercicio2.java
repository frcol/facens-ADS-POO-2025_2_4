package Aula_2.Tarefa;
/*
Exercício 2: Verificação de Número Par
Crie uma função que receba um número inteiro como parâmetro e retorne verdadeiro se 
o número for par, ou falso caso contrário.
*/
public class Exercicio2 {
    public static void main(String[] args) {
        if (ehPar(2)) {
            System.out.println("O número é par");
        }
    }
    
    public static boolean ehPar(int numero) {
        boolean result = numero % 2 == 0;
        
        return result;
    }
}
