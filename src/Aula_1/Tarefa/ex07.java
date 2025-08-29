package Aula_1.Tarefa;

/*
Calcular e apresentar o volume de uma lata de óleo, 
utilizando a fórmula:
   Volume = 3.14159 * r 2  * altura
 */
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        double raio, altura, volume;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual o raio: ");
        raio = entrada.nextDouble();

        System.out.println("Qual a altura: ");
        altura = entrada.nextDouble();

        volume = 3.14159 * Math.pow(raio, 2) * altura;

        System.out.println("Volume: " + volume + "metros cubicos");
    }
}
