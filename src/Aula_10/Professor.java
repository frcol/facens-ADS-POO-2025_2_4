
package Aula_10;


public class Professor extends Pessoa{
    public Professor(String nome) {
        super(nome);
    }

    @Override
    public void imprimir() {
        System.out.println("teste....");
    }
}
