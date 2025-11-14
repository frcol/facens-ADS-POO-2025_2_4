package Aula_11;

public class Carro extends Veiculo{
    private int numPortas;
    
    public Carro(String nome, int numPortas) {
        super(nome);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    
    
}
