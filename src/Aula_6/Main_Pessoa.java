package Aula_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Pessoa {
    public static void main(String[] args) {
        ArrayList<Pessoa> lstPessoas = new ArrayList<>();
        
        /*Pessoa p1 = new Pessoa("Joao", "1111");
        Pessoa p2 = new Pessoa("Maria", "22222");
        Pessoa p3 =  new Pessoa("Carla", "33333");
        
        lstPessoas.add(p1);
        lstPessoas.add(p2);
        lstPessoas.add(p3);*/
        
        // mostrem o nome da 2º pessoa da lista (Maria)
        //System.out.println(lstPessoas.get(1).getNome());
        
        // mostre todos os dados da 1º pessoa (imprimir)
        //lstPessoas.get(0).imprimir();
        
        Scanner sc = new Scanner(System.in);
        Pessoa p = null;
        int count = 0;
        
        // cadastro
        do {
            System.out.print("\nNome: ");
            String nome = sc.next();
            System.out.print("\nCPF: ");
            String cpf = sc.next();

            p = new Pessoa(nome, cpf);
            lstPessoas.add(p);
            count++;
        } while (count < 3);
        
        // imprimir todos
        /*for (Pessoa pe : lstPessoas) {
            pe.imprimir();
        }*/
        
        // Busca por nome
        for (Pessoa pessoa : lstPessoas) {
            if (pessoa.getNome().equals("Fabio")) {
                pessoa.imprimir();
            }
        }
    }
}
