package Aula_3;

public class Main_Cliente {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.setCpf("123");
        c.setNome("Fabio");
        c.setIdade(52);
        c.imprimir();
    }
}
