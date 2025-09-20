package Aula_3.Tarefas;

public class ContaBancaria {
    private String id;
    private double saldo = 0;
    
    // =====================================
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor) {
        saldo += valor;
    }
    
    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        else {
           return false; 
        }
    }
}
