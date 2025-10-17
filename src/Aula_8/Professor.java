package Aula_8;

public class Professor extends Pessoa {
    private String cracha;
    private char tipoVinculo;
    private double salario;

    
    public Professor(String nome, String cpf, String cracha) {
        super(nome, cpf);
        this.cracha = cracha;
    }
    
    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String imprimir() {
        String msg = "\n### PROFESSOR ###"
                    +super.imprimir()
                
                    +"\nCracha: "+cracha
                    +"\nTipo vinculo: "+tipoVinculo
                    +"\nSalario: "+salario;
        
        return msg;
    }
}
