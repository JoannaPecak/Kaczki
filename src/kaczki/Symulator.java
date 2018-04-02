package kaczki;

import java.awt.List;
import java.util.ArrayList;

public class Symulator {

    public static void main(String[] args) {

        Kaczka dzika = new DzikaKaczka("dziwaczka");

        dzika.kwacz();
        dzika.lataj();
        dzika.wyswietl();

        Kaczka gumowa = new GumowaKaczka("¿ó³ta");
        Kaczka drewniana = new DrewnianaKaczka("Dêbowa");
        Kaczka mandarynka = new MandarynkaKaczka("samiec");

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
        System.out.println("------------------");
        gumowa.kwacz();

        gumowa.setKwakanie(new Niemowa());

        gumowa.kwacz();

        Ges ges = new Ges("dzika");
        Kaczka gesAdapter = new GesKaczkaAdapter(ges);

        kaczki.add(gesAdapter);

        gesAdapter.wyswietl();
        gesAdapter.lataj();
        gesAdapter.plywaj();
        gesAdapter.kwacz();
    }
}