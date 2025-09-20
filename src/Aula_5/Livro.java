package Aula_5;

public class Livro {
    private String nome;
    private String isbn;
    private int numPaginas;

    public Livro(String nome, String isbn, int numPaginas) {
        this.nome = nome;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    public String imprimir() {
        String msg = nome+"("+isbn+") - paginas:"+numPaginas;
        return msg;            
    }
}
