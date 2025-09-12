package Aula_4;

public class Aluno {
    private String nome;
    private String ra;
    private String curso;
    
    public Aluno(String nome, String ra, String curso) {
        System.out.println("Objeto instanciado...");
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void imprimir() {
        String msg = "\n=================="
                    +"\nNome: "+nome
                    +"\nCurso: "+curso
                    +"\nRA: "+ra
                    +"\n==================";
        
        System.out.println(msg);
    }
}
 