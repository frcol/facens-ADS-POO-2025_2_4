package Aula_2.Tarefa;

/*
Exercício 4: Conversão de Temperatura
Crie uma função que converta uma temperatura em graus Celsius para Fahrenheit. 
A função deve receber a temperatura em Celsius como parâmetro e retornar a 
temperatura equivalente em Fahrenheit.
F = C * 9/5 + 32.
*/
public class Exercicio4 {
    public static void main(String[] args) {
        System.out.printf("Temperatura: %.2f\n", celsiusParaFahrenheit(36.6));
    }
    
    public static double celsiusParaFahrenheit(double tempCelsius) {
        double resultado = tempCelsius * 9/5 + 32;
        
        return resultado;
    }
}
