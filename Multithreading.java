public class Multithreading implements Runnable {

    @Override
    public void run() {
        System.out.println("Currently the " + Thread.currentThread().getName() + " is running!");
        try {
            Jatszma jatszma = new Jatszma();
            jatszma.start();
        } catch (Exception e) {
            System.out.println("Hopááá!" + e.getMessage());

        }
    }
}
