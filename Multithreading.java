public class Multithreading implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < Karakter.OSSZES; i++) {

            try {
                System.out.println("Jelenleg a " + Thread.currentThread().getName() + " szál fut!");

                Jatszma jatszma = new Jatszma();
                jatszma.start();



            } catch (Exception e) {
                System.out.println("Hopááá!" + e.getMessage());

            }

        }
    }



}
