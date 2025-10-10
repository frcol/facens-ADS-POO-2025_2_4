package Aula_7;

public class Main_Func {
    public static void main(String[] args) {
       Funcionario f1 = new Funcionario("Fabio");
       Funcionario f2 = new Funcionario("Edson");
       Funcionario f3 = new Funcionario("Eliney");
       Funcionario f4 = new Funcionario("Patricia");
       
       f3.addSubordinado(f1);
       f3.addSubordinado(f2);
       
       f4.addSubordinado(f3);
       
       f4.imprimir();
        
    }
}

