package Aula_11;

public class MotoAutomatica extends Moto implements IAutomatico{

    public MotoAutomatica(String nome) {
        super(nome);
    }

    public void mudarMarchaAutomaticamente() {
        System.out.println("Moto automatico muda marcha");
    }
}
