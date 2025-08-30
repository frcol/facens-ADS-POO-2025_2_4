package Aula_2;

import java.util.Scanner;

public class Main_funcoes {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Num1: ");
//        double num1 = scan.nextDouble();
//        System.out.println("Num2: ");
//        double num2 = scan.nextDouble();
//        
//        soma(num1, num2);

//        String r = enviaEmail("Teste", "asd@sda", "sfsd@sdas", "Legal");
//        System.out.println(r);

//        double r = soma(5,9);
//        System.out.println("Resultado: "+r);

          String t = nomeCompleto("Fabio", "Colombini", 52);
          System.out.println(t);
    }
    
    public static String enviaEmail(String assunto, String reme, String desti, String corpo) {
        String msg = "\n\nAssunto: "+assunto;
        msg += "\nremetente: "+reme;
        msg = msg + "\ndestinatario: "+desti;
        msg = msg + "\ncorpo: "+corpo; 
        
        return msg;
    }
    
    public static double soma(double x, double y) {
        double resultado = x + y;
        
        return resultado;
    }
    
    public static String nomeCompleto(String nome, String sobrenome, int idade) {
        String msg = nome+" "+sobrenome;
        msg += " e sua idade é "+idade;
        
        return msg;
    }
}
