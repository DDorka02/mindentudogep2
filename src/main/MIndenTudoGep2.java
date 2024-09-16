package main;

import modell.MindenTudoGep;


public class MIndenTudoGep2 {

    public static void main(String[] args) {
        new MIndenTudoGep2().lottoszelvenyBemutato();
    }

    private void lottoszelvenyBemutato() {
        MindenTudoGep gep = new MindenTudoGep();
        
        //boolean
//        System.out.println("1. szelveny");
//        gep.szelvenytGeneral();
//        boolean[] szelveny = gep.getSzelvenyBoole();
//        mutatoBooleSzelveny(szelveny);
        
//        szelveny[10]= true;

//            int tomb
        System.out.println("1. (int) szelveny");
        gep.getSzelvenyInt();
        int[] szelveny = gep.getSzelvenyInt();
        mutatoIntSzelveny(szelveny);
    }

    private void mutatoIntSzelveny(int[] szelveny) {
        for(int szam: szelveny){
            System.out.println(szam+"");
        }
    }
    
}
