package Aula_5;

public class Pessoa {
    private String nome;
    private int idade;
    private Livro livro;
    private int diasDevolucao;
    
    public Pessoa() {
        System.out.println("Objeto instanciado...");
    }
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public Pessoa(String nome, int idade, Livro livro, int diasDevolucao) {
        this.nome = nome;
        this.idade = idade;
        this.livro = livro;
        this.diasDevolucao = diasDevolucao;
    }
    
    public String getLivro() {
        if (livro == null) {
            return "-------";
        }
        else {
          return livro.getNome();  
        }  
    }
    
    public String getNome() {
        if (nome == null) {
            return "*****";
        }
        else {
            return nome;
        }
    }
    public void emprestar(Livro livro) {
        this.livro = livro;
        this.diasDevolucao = 20;
    }
    
    public void emprestar(Livro livro, int diasDevolucao) {
        this.livro = livro;
        this.diasDevolucao = diasDevolucao;
    }
    
    public void imprimir() {
        String msg = "\n==================="
                    +"\nNome: "+getNome()
                    +"\nIdade: "+idade
                    +"\nLivro: "+ livro.imprimir()
                    +"\nDias devolução: "+diasDevolucao
                    +"\n===================";
        System.out.println(msg);
    }
}
