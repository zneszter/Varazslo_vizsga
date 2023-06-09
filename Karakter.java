

import java.util.Random;

public class Karakter extends Multithreading implements Kepessegek {

    int elet;
    String nev;
    int pozicio;
    int utesero;
    int gyozelem;
    static int OSSZES = 20;
    static int V_GYOZELEM = 0;
    static int H_GYOZELEM = 0;
    static int HV_DONTETLEN = OSSZES;



    Random random = new Random();


    public Karakter() {
        this.elet = this.eletero();
    }

    public static int getvGyozelem() {
        return V_GYOZELEM;
    }

    public static void setvGyozelem(int vGyozelem) {
        V_GYOZELEM = vGyozelem;
    }

    public static int gethGyozelem() {
        return H_GYOZELEM;
    }

    public static void sethGyozelem(int hGyozelem) {
        H_GYOZELEM = hGyozelem;
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

    public int getGyozelem() {
        return gyozelem;
    }

    public void setGyozelem(Karakter karakter) {
        int tmp = this.getGyozelem();
        this.gyozelem = tmp+1;

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
