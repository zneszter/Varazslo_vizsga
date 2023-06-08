public class Harcos extends Karakter{

    public Harcos() {
        super();
        this.nev = "H";
    }

    @Override
    void tamad (Karakter karakter) {
        utesero = karakter.dob();
        karakter.setElet(utesero);
        System.out.println("A harcos (" + this.getNev() + ") támad! Ütőereje: " + utesero + " A harcos élete: " + this.getElet() + " A varazsló élete: " + karakter.getElet());
    }
}
