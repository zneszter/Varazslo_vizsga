public abstract class Multithreading implements Runnable {

    @Override
    public void run() {
        //for (int i = 0; i < 20; i++) {

            try {
                //System.out.println("Currently the " + Thread.currentThread().getName() + " is running!");
                Jatszma jatszma = new Jatszma();
                Eredmeny eredmeny = new Eredmeny();
                for (int i = 0; i < 20; i++) {
                    jatszma.start();
                    eredmeny.start();
                }

            } catch (Exception e) {
                System.out.println("Hopááá!" + e.getMessage());

            }
            //System.out.println("Currently the " + Thread.currentThread().getName() + " is running!");


        }



}
