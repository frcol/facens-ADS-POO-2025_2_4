package Aula_3.Tarefas;

import java.util.Scanner;

public class Main_Pessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = null;
        int opcao;

        do {
            System.out.println("\n\n--- MENU ---");
            System.out.println("1 - Criar pessoa");
            System.out.println("2 - Mostrar pessoa");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    pessoa = new Pessoa();

                    System.out.print("Digite o CPF: ");
                    pessoa.setCPF(sc.next());

                    System.out.print("Digite o nome: ");
                    pessoa.setNome(sc.next());

                    System.out.print("Digite o sexo (M/F/O): ");
                    pessoa.setSexo(sc.next().toUpperCase().charAt(0));

                    System.out.print("Digite a idade: ");
                    pessoa.setIdade(sc.nextInt());

                    System.out.println("\n\n## Cadastro realizado!");
                    break;

                case 2:
                    if (pessoa != null) {
                        System.out.println(pessoa.imprimir());
                    } else {
                        System.out.println("\n\n## Nenhuma pessoa cadastrada.");
                    }
                    break;

                case 3:
                    System.out.println("\n\n## Encerrando programa...");
                    break;

                default:
                    System.out.println("\n\n## Opção inválida.");
            }

        } while (opcao != 3);
    }
}