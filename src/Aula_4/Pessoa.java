package Aula_4;

public class Pessoa {
    private String cpf;
    private String nome;
    private String carteiraMotorista;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCarteiraMotorista() {
        return carteiraMotorista;
    }

    public void setCarteiraMotorista(String carteiraMotorista) {
        this.carteiraMotorista = carteiraMotorista;
    }
    
    //============================
    public String imprimir() {
        String msg = "\nCPF: "+cpf+
                "\nNome: "+nome+
                "\nCM: "+carteiraMotorista;
        
        return msg;
    }
}
