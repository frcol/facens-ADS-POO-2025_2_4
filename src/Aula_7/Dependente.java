package Aula_7;

public class Dependente {
    private String nome;
    private Socio titular;

    public Dependente(String nome, Socio titular) {
        this.nome = nome;
        this.titular = titular;
    }
    
    public Socio getTitular() {
        return titular;
    }

    public void setTitular(Socio titular) {
        this.titular = titular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void imprimir() {
        System.out.println(nome);
    }
}
