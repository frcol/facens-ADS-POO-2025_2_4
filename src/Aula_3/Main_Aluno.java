package Aula_3;

public class Main_Aluno {
    public static void main(String[] args) {
        Aluno a = new Aluno(); // instanciar objeto
        a.setRa("1111");
        a.setNome("Fabio");
        a.setCurso("ADS");
        
        Aluno b = new Aluno();
        b.setRa("2222");
        b.setNome("Joao");
        b.setCurso("Jogos");
        
        a.imprimir();
        b.imprimir();
    }
}
