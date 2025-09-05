package Aula_3;

public class Aluno {
    private String nome;
    private String ra;
    private String curso;
    
    public String getRa() { // Acessor
        return ra;
    }
    
    public void setRa(String ra) { // modificador
        this.ra = ra;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void imprimir() {
        System.out.println("\nNome: "+nome);
        System.out.println("RA: "+ra);
        System.out.println("Curso: "+curso);
    }
}
