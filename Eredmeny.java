public class Eredmeny extends Multithreading {


    public Eredmeny() {
    }

    public void start () {

            try {

                System.out.println("Jelenleg a " + Thread.currentThread().getName() + " fut!");
                System.out.println("Harcos gyozelmek: " + Karakter.H_GYOZELEM);
                System.out.println("Varazslo gyozelmek: " + Karakter.V_GYOZELEM);

            } catch (Exception e) {
                System.out.println("Hopááá!" + e.getMessage());
            }

//        System.out.println("Jelenleg a " + Thread.currentThread().getName() + " fut!");
//        System.out.println("Harcos gyozelmek: " + Karakter.H_GYOZELEM);
//        System.out.println("Varazslo gyozelmek: " + Karakter.V_GYOZELEM);
            //System.out.println("Döntetlen: " + (Karakter.OSSZES-(Karakter.H_GYOZELEM + Karakter.V_GYOZELEM)));


        }



}
