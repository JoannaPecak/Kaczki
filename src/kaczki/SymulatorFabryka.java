package kaczki;

import java.util.ArrayList;
import java.util.List;

public class SymulatorFabryka {

    public static void main(String[] args) {

        Kaczka dzika = Kaczka.dajKaczke(KaczkaTypy.Dzika, "dziwaczka");

        dzika.kwacz();
        dzika.lataj();
        dzika.wyswietl();

        Kaczka gumowa = Kaczka.dajKaczke(KaczkaTypy.Gumowa, "¿ó³ta");
        Kaczka drewniana = Kaczka.dajKaczke(KaczkaTypy.Drewniana, "Dêbowa");
        Kaczka mandarynka = Kaczka.dajKaczke(KaczkaTypy.Mandarynka,"samiec");

        List<Kaczka> kaczki = new ArrayList<Kaczka>();
        kaczki.add(dzika);
        kaczki.add(gumowa);
        kaczki.add(drewniana);
        kaczki.add(mandarynka);

        for (Kaczka kaczka : kaczki) {
            kaczka.wyswietl();
            kaczka.lataj();
            kaczka.plywaj();
            kaczka.kwacz();
        }
        System.out.println("--------------------");
        gumowa.kwacz();

        gumowa.setKwakanie(new Niemowa());

        gumowa.kwacz();

        Kaczka gesAdapter =
                Kaczka.dajKaczke(KaczkaTypy.Ges, "dzik¹");

        kaczki.add(gesAdapter);

        gesAdapter.wyswietl();
        gesAdapter.lataj();
        gesAdapter.plywaj();
        gesAdapter.kwacz();
    }
}