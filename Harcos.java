public class Harcos extends Karakter{

    public Harcos() {
        super();
        this.nev = "H";
    }

    void tamadas (Karakter karakter) {
        utesero = karakter.dob();
        karakter.setElet(utesero);
        System.out.println("A " + this.getNev() + "támad!");
    }
}
