package Aula_5.Tarefas;

import java.util.Scanner;

public class Main_Pocao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pocao atual = null; // �nica po��o ativa
        
        int poder;
        String op;
        
        do {
            System.out.println("\n=== Oficina de Po��es ===");
            System.out.println("[1] Criar po��o");
            System.out.println("[2] Ver po��o atual");
            System.out.println("[3] Usar po��o");
            System.out.println("[4] Descartar po��o");
            System.out.println("[5] Sair");
            System.out.print("Op��o: ");
            op = sc.next();

            switch (op) {
                case "1": // Criar po��o
                    System.out.println("\n\n-- Criar po��o --");
                    System.out.println("[1] Apenas nome");
                    System.out.println("[2] Nome + poder");
                    System.out.println("[3] Nome + poder + tipo");
                    System.out.print("Escolha: ");
                    String c = sc.next();

                    System.out.print("Nome: ");
                    String nome = sc.next();

                    switch (c) {
                        case "1":
                            atual = new Pocao(nome);
                            atual.setPoder(30);
                            atual.setTipo("Veneno");
                            break;
                        case "2":
                            System.out.print("Poder: ");
                            poder = sc.nextInt();
                            atual = new Pocao(nome, poder);
                            atual.setTipo("Son�fero");
                            break;
                        case "3":
                            System.out.print("Poder: ");
                            poder = sc.nextInt();
                           
                            System.out.print("Tipo: ");
                            String tipo = sc.next();
                            
                            atual = new Pocao(nome, poder, tipo);
                            break;
                        default:
                            System.out.println("\n\n## Op��o inv�lida.");
                    }

                    if (atual != null) {
                        System.out.println("\n\n## Po��o criada/substitu�da!");
                    }
                    break;

                case "2": // Ver po��o
                    if (atual == null) {
                        System.out.println("\n\n## N�o existe po��o ativa.");
                    } else {
                        atual.imprimir();
                    }
                    break;

                case "3": // Usar po��o
                    if (atual == null) {
                        System.out.println("\n\n## Crie uma po��o antes de usar.");
                        break;
                    }
                    
                    System.out.println("\n\n-- Usar po��o --");
                    System.out.println("[1] usar()");
                    System.out.println("[2] usar(alvo)");
                    System.out.println("[3] usar(alvo, vezes)");
                    System.out.print("Escolha: ");
                    String u = sc.next();

                    switch (u) {
                        case "1":
                            atual.usar();
                            break;
                        case "2":
                            System.out.print("Alvo: ");
                            String alvo = sc.next();
                            
                            atual.usar(alvo);
                            break;
                        case "3":
                            System.out.print("Alvo: ");
                            String alvo2 = sc.next();
                            
                            System.out.print("Vezes: ");
                            int vezes = sc.nextInt();
                            
                            atual.usar(alvo2, vezes);
                            break;
                        default:
                            System.out.println("\n\n## Op��o inv�lida.");
                    }
                    break;

                case "4": // Descartar
                    atual = null;
                    System.out.println("\n\n## Po��o descartada.");
                    break;

                case "5": // Sair
                    System.out.println("\n\n## At� mais!");
                    break;

                default:
                    System.out.println("\n\n## Op��o inv�lida.");
            }
        } while (!op.equals("5"));
    }
}
