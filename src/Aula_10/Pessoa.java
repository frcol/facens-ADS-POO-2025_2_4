package Aula_10;

public abstract class Pessoa {
    private String nome;
    private static int contador;

    public Pessoa(String nome) {
        this.nome = nome;
        contador++;
    }

    public static void setContador(int aContador) {
        contador = aContador;
    }
    

    public String getNome() {
        return nome;
    }
    
    public static void mostraTotalPessoa() {
        System.out.print("Total de pessoas: "+contador+"\n\n");
    }

    public void mostra() {
        System.out.println("Nome: "+nome);
        System.out.print("Total de pessoas: "+contador+"\n\n"); 
    }
    
    public abstract void imprimir();
}
