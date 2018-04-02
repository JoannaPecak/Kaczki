package kaczki;

public class MandarynkaKaczka extends Kaczka {
    public MandarynkaKaczka(String nazwa) {
        super("Mandarynka: " + nazwa, new Latajaca(), new Kwaczka());
    }
}