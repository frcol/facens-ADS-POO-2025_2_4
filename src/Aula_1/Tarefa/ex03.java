package Aula_1.Tarefa;
/*
Construir um algoritmo para calcular a área de uma 
circunferência com raio 5 cm. (ac= *raio 2 )  =3,14159.
*/
public class ex03 {

	public static void main(String[] args) {

		double raio = 5.0;
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println("Area da circunferencia: " + area);

	}
}
