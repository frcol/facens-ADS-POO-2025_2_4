package Aula_5;

public class Main_Pessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Pessoa p1 = new Pessoa("Fabio", 52);
        Pessoa p2 = new Pessoa("Maria", 33, "Ensaio sobre a cegueira", 200);
        
        p2.emprestar("Desventuras em Series", 44);
        
        p2.imprimir();
    }
}
