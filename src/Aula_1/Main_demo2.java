package Aula_1;

import java.util.Scanner;

public class Main_demo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // [1]- Cadastrar
        // [2]- Buscar
        // [3]- Sair
//        System.out.println("[1]- Cadastrar");
//        System.out.println("[2]- Buscar");
//        System.out.println("[3]- Sair");
//        int opt = scan.nextInt();
//        
//        switch (opt) {
//            case 1:
//                System.out.println("Cadastrando...");
//                break;
//            case 2:
//                System.out.println("Buscando...");
//                break;
//            case 3:
//                System.out.println("Tchau...");
//                break;
//            default:
//                System.out.println("Opcao invalida...");
//        }
        
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        
        int num;
        do {
            System.out.println("Numer: ");
            num = scan.nextInt();
        } while (num >= 0);
    }
}
