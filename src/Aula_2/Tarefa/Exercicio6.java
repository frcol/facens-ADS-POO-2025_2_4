package Aula_2.Tarefa;

/*
Exercício 6: Número primo
Escreva uma função chamada ehPrimo que receba um número inteiro como parâmetro e 
retorne true se o número for primo e false caso contrário.
Instruções:
Um número primo é divisível apenas por 1 e por ele mesmo.
Entrada: Um número inteiro.
Saída: Um valor booleano indicando se o número é primo ou não..
 */
public class Exercicio6 {
    public static void main(String[] args) {
        float num = 37;
        System.out.println("É primo: "+ehPrimo(num));
    }
    
    public static boolean ehPrimo(float num) {
        if (num <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        
        for (int i = 2; i < num;i++) {
            float result = num % i;
            if (result == 0) {
                return false;
            }
        }
        
        return true;
    }
    
}
