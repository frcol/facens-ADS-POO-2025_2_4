package Aula_7;

import java.util.ArrayList;

public class Socio {
    private String nome;
    private ArrayList<Dependente> lstDependentes;

    public Socio(String nome) {
        this.nome = nome;
        lstDependentes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addDependente(Dependente dep) {
        lstDependentes.add(dep);
    }
    
    public void addDependente(String nome) {
        Dependente tmp = new Dependente(nome, this);
        lstDependentes.add(tmp);
    }
    
    public void imprimirDependentes() {
        for (Dependente d : lstDependentes) {
            System.out.println(d.getNome());
        }
    }
    
    public void imprimir() {
        System.out.println("Nome: "+nome);
        
        for (Dependente d : lstDependentes) {
            System.out.println("\t"+d.getNome());
        }
    }
}
