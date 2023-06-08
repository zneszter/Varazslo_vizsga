public class Varazslo extends Karakter{

    public Varazslo() {
        this.nev = "V";
    }

    void tamadas (Karakter karakter) {
        utesero = karakter.dob();
        karakter.setElet(utesero);
        System.out.println("A " + this.getNev() + "támad!");
    }
}
