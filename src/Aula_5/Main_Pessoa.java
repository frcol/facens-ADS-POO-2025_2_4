package Aula_5;

public class Main_Pessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Pessoa p1 = new Pessoa("Fabio", 52);
        Livro l1 = new Livro("Star wars", "111", 123);
        Pessoa p2 = new Pessoa("Maria", 33, l1 , 200);
        
        p2.imprimir();
    }
}
