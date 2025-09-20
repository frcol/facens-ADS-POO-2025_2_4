package Aula_3.Tarefas;

class Pessoa {
    private String cpf;
    private String nome;
    private char sexo;
    private int idade;

    // Getters e Setters
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getCPF() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
   }

    public char getSexo() {
        return sexo;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("\n\n## Idade inválida. Deve ser >= 0.");
        }
    }

    public int getIdade() {
        return idade;
    }

    // Método imprimir
    public String imprimir() {
        return "\n\n======================="+
               "CPF: " + cpf + "\n" +
               "Nome: " + nome + "\n" +
               "Sexo: " + sexo + "\n" +
               "Idade: " + idade + " anos\n"+
                "=======================";
    }
}
