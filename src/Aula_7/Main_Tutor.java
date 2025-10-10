package Aula_7;

public class Main_Tutor {
    public static void main(String[] args) {
        Tutor t1 = new Tutor("Fabio", "12323");
        
        Pet p1 = new Pet("Ozzy", "Cao", 4);
        Pet p2 = new Pet("Stefanny", "cao", 19);
        
        t1.addPet(p1);
        t1.addPet(p2);
        
        System.out.println(t1.imprimir());
    }
}
