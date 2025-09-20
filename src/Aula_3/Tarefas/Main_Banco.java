package Aula_3.Tarefas;

public class Main_Banco {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.depositar(100);
        System.out.println(conta1.getSaldo());
        
        conta1.sacar(50);
        System.out.println(conta1.getSaldo());
        
        if (conta1.sacar(100)) {
            System.out.println(conta1.getSaldo());
        }
        else {
            System.out.println("Saldo insuficiente");
        }
        
    }
}
