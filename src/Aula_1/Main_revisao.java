package Aula_1;

import java.util.Scanner;

public class Main_revisao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                
        System.out.println("Qual o seu nome");
        String nome = scan.next();
        
        System.out.println("Qual a sua idade?");
        int idade = scan.nextInt();
        
        if (idade >= 18 && nome.equals("admin")) {
            System.out.println("O "+nome+" tem "+idade+" anos");
        }
        else {
            System.out.println("## ACESSO NEGADO ##");
        }
        
        
        float valor = 33.50f;
        double salario = 14567.25;
        char genero = 'm';
        boolean isActive = true;
        

        
    }
}
