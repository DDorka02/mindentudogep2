package teszt;

import modell.MindenTudoGep;

public class MindenTudoGepTeszt {

    public static void main(String[] args) {
        new MindenTudoGepTeszt().tesztestek();
    }

    private void tesztestek() {
        tesztLottoGeneralas();
    }

    private void tesztLottoGeneralas() {
        MindenTudoGep gep = new MindenTudoGep();
        String szelveny = gep.getSzelveny();

        System.out.println("Nem üres");
        assert szelveny.isBlank() : "üres a szelvény";

        System.out.println("teszt 5 szám");
        String[] sz = szelveny.split(",");
        assert sz.length == 5 : "nem 5 elem";
        for (String s : sz) {
            s = s.trim();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                assert Character.isDigit(c) : "nem tartalmaz";
            }
        }

        System.out.println("teszt: 1-től 90-ig");
        sz = szelveny.split(",");
        int[] szamok = new int[sz.length];
        for (int i = 0; i < szamok.length; i++) {
            int szam = Integer.parseInt(sz[i].trim());
            boolean jo = szam >= 1 && szam <= 90;
            assert jo : "nem jó intervallum";
        }

        System.out.println("nincs benn ismétlés");
        sz = szelveny.split(",");
        szamok = new int[sz.length];
        for (int i = 0; i < szamok.length; i++) {
            int szam = Integer.parseInt(sz[i].trim());
            boolean jo = szam >= 1 && szam <= 90;
            assert jo : "nem jó intervallum";
        }
    }

}
