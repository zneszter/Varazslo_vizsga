public class Multithreading implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < Karakter.OSSZES; i++) {

            try {
                //System.out.println("Currently the " + Thread.currentThread().getName() + " is running!");

                Jatszma jatszma = new Jatszma();
                Eredmeny eredmeny = new Eredmeny();
//
                eredmeny.start();
                jatszma.start();



            } catch (Exception e) {
                System.out.println("Hopááá!" + e.getMessage());

            }

        }
    }



}
