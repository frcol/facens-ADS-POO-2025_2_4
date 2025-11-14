package Aula_11;

public class CarroAutomatico extends Carro implements IAutomatico {
    
    public CarroAutomatico(String nome, int numPortas) {
        super(nome, numPortas);
    }

    @Override
    public void mudarMarchaAutomaticamente() {
        System.out.println("Carro automatico muda marcha");
    }
}
