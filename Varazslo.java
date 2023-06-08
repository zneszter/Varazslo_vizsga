public class Varazslo extends Karakter{

    public Varazslo() {
        this.nev = "V";
    }

    @Override
    public int tamad (Karakter karakter) {
        int utesero = karakter.dob();
        karakter.setElet(utesero);
        System.out.println("A varázsló (" + this.getNev() + ") támad! Ütőereje: " + utesero + " A varázsló élete: " + this.getElet() + " A harcos élete: " + karakter.getElet());
        return utesero;
    }
}
