package kaczki;

public class Ges {
    private final String name;

    public Ges() {
        this.name = "G�";
    }

    public Ges(String nazwa) {
        this.name = nazwa;
    }

    public void gegaj() {
        System.out.println("G�, g�");
    }

    public void wyswietlGes() {
        System.out.println("Jestem g�si�:" + name);
    }

    public void plywajPoGesiemu() {
        System.out.println("P�ywam sobie g�siowo");
    }

    public void latajPoGesiemu() {
        System.out.println("Latam sobie g�siowo");
    }
}
