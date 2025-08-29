package Aula_1.Tarefa;
/*
Construir um algoritmo para imprimir a soma (concatenar) das seguintes 
strings ?Hugo?, ?gastou 50 reais?, ?ontem?.
*/
public class ex04 {
	public static void main(String[] args) {
		
		String texto = "";
		texto += "Hugo"; // texto = texto + "Hugo";
		texto += " gastou 50 reais";
		texto += " ontem";

		System.out.println("String: " + texto);

	}
}
