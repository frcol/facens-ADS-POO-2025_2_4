package Aula_7;

import java.util.ArrayList;

public class Tutor {
    private String nome;
    private String cpf;
    private ArrayList<Pet> lstPets;

    public Tutor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        lstPets = new ArrayList<>();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addPet(Pet pet) {
        lstPets.add(pet);
    }
    
    public void addPet(String nome, String raca, int idade) {
        Pet tmp = new Pet(nome, raca, idade);
        lstPets.add(tmp);
    }
    
    public String imprimir() {
        String msg = "================="
                +"\nNome: "+nome
                +"\nCPF: "+cpf;
        
        for (Pet p : lstPets) {
            msg += "\t"+ p.imprimir();
        }
        
        return msg;
    }
}
