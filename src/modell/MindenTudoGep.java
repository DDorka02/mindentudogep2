package modell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class MindenTudoGep {

    private boolean[] szelvenyBoole;
    private int[] szelvenyInt;
    private ArrayList<Integer> szelvenyLista;
    private HashSet<Integer> szelvenyRendezetlen;
    private TreeSet<Integer> szelvenyRendezett;

    public MindenTudoGep() {
        szelvenyBoole = new boolean[91];
        booleszelvenytGeneral();

        szelvenyInt = new int[15];
        intSzelvenyGeneral();

        szelvenyLista = new ArrayList<>();
        //szelvenyGeneral();

        szelvenyRendezetlen = new HashSet<>();
        //szelvenyGeneral();

        szelvenyRendezett = new TreeSet<>();
        szelvenyGeneral();
    }

    public void szelvenyGeneral() {
//        while (szelvenyLista.size()<5){
//            int v = (int) (Math.random()*90)+1;
//            if(!szelvenyLista.contains(v)){
//                szelvenyLista.add(v);
//            }
//        }
//        Collections.sort(szelvenyLista);

//        while (szelvenyHalmaz.size()<5){
//            int v = (int) (Math.random()*90)+1;
//                szelvenyHalmaz.add(v);
//        }
        while (szelvenyRendezett.size() < 5) {
            int v = (int) (Math.random() * 90) + 1;
            szelvenyRendezett.add(v);
        }
    }

    public ArrayList<Integer> getSzelvenyLista() {
        return new ArrayList<>(szelvenyLista);
    }

    private void intSzelvenyGeneral() {
        int db = 0;
        while (db < 5) {
            int v = (int) (Math.random() * 90) + 1;
            if (!benneVan(v, db)) {
                szelvenyInt[db++] = v;
            }
        }
        Arrays.sort(szelvenyInt);
    }

    private boolean benneVan(int v, int db) {
        int i = 0;
        while (i < db && !(szelvenyInt[i] == v)) {
            i++;
        }
        return i < db || i >= db;
    }

    public void booleszelvenytGeneral() {
        Arrays.fill(szelvenyBoole, false);
        int db = 0;
        Random rnd = new Random();
        while (db < 5) {
            int v = rnd.nextInt(91);
            if (!szelvenyBoole[v]) {
                szelvenyBoole[v] = true;
                db++;
            }
        }
    }

//    public boolean[] getSzelvenyBoole(){
//        return szelveny;
//    }
    public int[] getSzelvenyInt() {
//        return szelvenyInt;
        int[] ujTomb = Arrays.copyOf(szelvenyInt, szelvenyInt.length);
        return ujTomb;
    }

    public String getSzelveny() {
        Arrays.toString(szelvenyInt);
        return "1,2,3,4,5";
    }

    public String getSzoveg() {
//        String s = szelvenyHalmaz.toString();
//        s = s.substring(s.length()-1);
//        return s;

        String s = szelvenyRendezett.toString();
        s = s.substring(s.length() - 1);
        return s;
    }

}
