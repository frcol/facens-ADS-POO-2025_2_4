package Aula_10;

public class Conta {
    private static int contador = 0;
    
    public Conta() {
        contador++;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public static void imprimir() {
        System.out.println("Contador: "+contador);
    }
}
