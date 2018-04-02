package kaczki;

public class DrewnianaKaczka extends Kaczka {
    public DrewnianaKaczka(String nazwa) {
        super("Drewaniana: " + nazwa, new Nielot(), new Niemowa());
    }
}
