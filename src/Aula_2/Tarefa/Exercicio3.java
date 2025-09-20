package Aula_2.Tarefa;

/*
Exercício 3: Contagem de Caracteres
Desenvolva uma função que conte quantas vezes um determinado caractere aparece 
em uma string. A função deve receber a string e o caractere como parâmetros e 
retornar a contagem.
Lembre-se de que você pode usar o método charAt() para acessar caracteres 
individuais em uma string.
*/
public class Exercicio3 {
    public static void main(String[] args) {
        int result =  contarCaractere("Antonio", 'o');
        System.out.println(result);
    }
    
    public static int contarCaractere(String texto, char caracter) {
        int contagem = 0;
        
        for (int i=0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                contagem++;
            }
        }
        
        return contagem;
    }
}
