package kaczki;

public class DzikaKaczka extends Kaczka{
    public DzikaKaczka(String nazwa) {
        super("Dzika: " + nazwa, new Latajaca(), new Kwaczka());
    }
}
