package Aula_8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Fabio", "123", "P1");
        Aluno a1 = new Aluno("Maria", "2222", "A01");
        
        System.out.println(prof.imprimir());
        System.out.println(a1.imprimir());
        
        ArrayList<Pessoa> lstPessoa = new ArrayList<>();
        lstPessoa.add(a1);
        lstPessoa.add(prof);
        
        
        for (Pessoa p : lstPessoa) {
            System.out.println(p.imprimir());
        }
    }
}
