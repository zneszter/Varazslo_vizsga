

import java.util.Random;

public class Karakter implements Kepessegek {

    int elet;
    String nev;
    int pozicio;
    int utesero;

    Random random = new Random();


    public Karakter() {
        this.elet = this.eletero();
    }

    public int getElet() {
        return elet;
    }

    public void setElet(int utesero) {
        int tmp = this.elet - utesero;
        if (tmp < 0) {
            this.elet = 0;
        } else {
            this.elet = tmp;
        }

    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getPozicio() {
        return pozicio;
    }

    public void setPozicio(int pozicio) {
        this.pozicio = pozicio;
    }

    @Override
    public int eletero() {
        return (random.nextInt(6)+3);
    }

    @Override
    public int dob() {
        return (random.nextInt(6)+1);
    }

    @Override
    public int lep() {
        return random.nextInt(3);
    }

    @Override
    public int tamad(Karakter karakter) {
        return 0;
    }
}
