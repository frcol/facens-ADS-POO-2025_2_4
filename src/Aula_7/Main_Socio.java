package Aula_7;

public class Main_Socio {
    public static void main(String[] args) {
        Socio s = new Socio("Fabio");
        
        s.addDependente(new Dependente("Igor", s));
        s.addDependente("Ana");
        
        s.imprimir();
        s = null;
        
    }
}
