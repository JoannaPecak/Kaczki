package kaczki;

public class Ges {
    private final String name;

    public Ges() {
        this.name = "Gêœ";
    }

    public Ges(String nazwa) {
        this.name = nazwa;
    }

    public void gegaj() {
        System.out.println("Gê, gê");
    }

    public void wyswietlGes() {
        System.out.println("Jestem gêsi¹:" + name);
    }

    public void plywajPoGesiemu() {
        System.out.println("P³ywam sobie gêsiowo");
    }

    public void latajPoGesiemu() {
        System.out.println("Latam sobie gêsiowo");
    }
}
