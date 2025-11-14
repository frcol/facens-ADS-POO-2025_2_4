package Aula_11;

import java.util.ArrayList;

public class Main_Interfae {
    public static void main(String[] args) {
        CarroAutomatico c1 = new CarroAutomatico("Ferrari", 2);
        MotoAutomatica m1 = new MotoAutomatica("Suzuki");
        
        ArrayList<IAutomatico> lstAutomaticos = new ArrayList<>();
        lstAutomaticos.add(c1);
        lstAutomaticos.add(m1);

        
        for (IAutomatico v : lstAutomaticos) {
            v.mudarMarchaAutomaticamente();
        }
    }
}
