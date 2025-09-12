package Aula_4;

import java.util.Scanner;

public class Main_Pessoa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opt;
        Pessoa pessoa = null;
        
        do {
            System.out.println("[1]- Cadastrar");
            System.out.println("[2]- Mostrar");
            System.out.println("[3]- Sair");
            opt = scan.nextInt();
            
            switch (opt) {
                case 1: // cadastrar
                    System.out.print("Nome: ");
                    String nome = scan.next();
                    System.out.print("CPF: ");
                    String cpf = scan.next();
                    System.out.print("CM: ");
                    String cm = scan.next();
                    
                    pessoa = new Pessoa(cpf, nome);
                    pessoa.setCarteiraMotorista(cm);
                    
                    break;
                case 2: // mostrar
                    if(pessoa != null) {
                        System.out.println(pessoa.imprimir());
                    }
                    else {
                        System.out.println("Cadastre uma pessoa primeiro [1]");
                    }
                    break;
                case 3: // sair
                    System.out.println("Obrigado por usar nosso App");
                    break;
                default:
                    System.out.println("## OPCAO INVALIDA ##");
            }
            
        } while(opt != 3);
    }
}
