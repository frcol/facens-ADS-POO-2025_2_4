package Aula_5.Tarefas;

public class Pocao {

    private String nome;
    private int poder;
    private String tipo;

    // Construtores
    public Pocao(String nome) {
        setNome(nome);
        setPoder(30);        // padrão
        setTipo("Veneno");   // padrão
    }

    public Pocao(String nome, int poder) {
        setNome(nome);
        setPoder(poder);     // valida 
        setTipo("Sonífero"); // padrão
    }

    public Pocao(String nome, int poder, String tipo) {
        setNome(nome);
        setPoder(poder);     // valida
        setTipo(tipo);
    }

    // Sobrecarga de usar(...)
    public void usar() {
        System.out.println("\t\tA poção " + nome + " foi usada!");
        System.out.println("\t\tEla causou " + poder + " de dano.");
    }

    public void usar(String alvo) {
        System.out.println("\t\tA poção " + nome + " foi usada em " + alvo + "!");
        System.out.println("\t\tEla causou " + poder + " de dano.");
    }

    public void usar(String alvo, int vezes) {
        System.out.println("\t\tA poção " + nome + " foi usada " + vezes + " vezes em " + alvo + "!");
        System.out.println("\t\tEla causou " + poder + " de dano.");
    }

    // Getters/Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        if (poder >= 1 && poder <= 100) {
            this.poder = poder;
        } else {
            System.out.println("\n\n## Valor de poder inválido! Deve estar entre 1 e 100. Alteração ignorada.");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void imprimir() {
        System.out.println("\n\n=== Dados da Poção ===");
        System.out.println("Nome : " + nome);
        System.out.println("Poder: " + poder);
        System.out.println("Tipo : " + tipo);
    }
}
