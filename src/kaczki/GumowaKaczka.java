package kaczki;

public class GumowaKaczka extends Kaczka {

    public GumowaKaczka(String nazwa) {
        super("Gumowa: "+nazwa, new Nielot(), new Piskajaca());
    }
}