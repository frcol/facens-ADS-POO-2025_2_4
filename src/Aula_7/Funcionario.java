package Aula_7;

import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private ArrayList<Funcionario> lstSubordinados;
    Funcionario chefe;
    
    public Funcionario(String nome) {
        this.nome = nome;
        lstSubordinados = new ArrayList<>();
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }

    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addSubordinado(Funcionario func) {
        lstSubordinados.add(func);
        
    }
    
    public void imprimirSubordinados() {
        for (Funcionario f : lstSubordinados) {
            System.out.println(f.getNome());
        }
    }
    
    public void imprimir() {
        System.out.println("Nome: "+nome);
        for (Funcionario f : lstSubordinados) {
            System.out.println("\t"+f.getNome());
        }
    }
}
