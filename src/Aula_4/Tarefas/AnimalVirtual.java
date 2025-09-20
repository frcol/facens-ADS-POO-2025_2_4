
package Aula_4.Tarefas;


public class AnimalVirtual {
    // Atributos privados (encapsulamento)
    private String nome;
    private String tipo;
    private int idade;
    private int energia;
    private int felicidade;
    private boolean vivo;

    // Construtor
    public AnimalVirtual(String nome, String tipo, int idade) {
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
        this.energia = 100;
        this.felicidade = 100;
        this.vivo = true;
    }

    public void alimentar() {
        if (!vivo) {
            System.out.println("\n\n## O animal está morto. Não é possível alimentar.");
            return;
        }
        energia += 10;
        System.out.println("\n\n## " + nome + " foi alimentado(a). Energia +10.");
    }

    public void brincar() {
        if (!vivo) {
            System.out.println("\n\n## O animal está morto. Não é possível brincar.");
            return;
        }
        felicidade += 10;
        energia -= 5;
        System.out.println("\n\n## " + nome + " brincou. Felicidade +10, Energia -5.");

        // Se energia < 0, o animal morre
        if (energia <= 0) {
            vivo = false;
            System.out.println("\n\n## " + nome + " ficou sem energia e morreu.");
        }
    }

    public void dormir() {
        if (!vivo) {
            System.out.println("\n\n## O animal está morto. Não é possível dormir.");
            return;
        }
        energia = 100;
        System.out.println("\n\n## " + nome + " dormiu e restaurou a energia para 100.");
    }

    public boolean checkVivo() {
        return vivo;
    }

    public void mostrarStatus() {
        System.out.println("\n\n===== STATUS DO ANIMAL =====");
        System.out.println("Nome:       " + nome);
        System.out.println("Tipo:       " + tipo);
        System.out.println("Idade:      " + idade);
        System.out.println("Energia:    " + energia);
        System.out.println("Felicidade: " + felicidade);
        System.out.println("Vivo:       " + (vivo ? "Sim" : "Não"));
        System.out.println("============================");
    }
}
