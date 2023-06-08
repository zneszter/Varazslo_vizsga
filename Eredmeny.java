public class Eredmeny extends Multithreading {

    public Eredmeny() {
    }

    public void start () {

        System.out.println("Currently the " + Thread.currentThread().getName() + " is running!");
        System.out.println("Harcos gyozelmek: " + Karakter.H_GYOZELEM);
        System.out.println("Varazslo gyozelmek: " + Karakter.V_GYOZELEM);
        System.out.println("Döntetlen: " + Karakter.HV_DONTETLEN);

    }


}
