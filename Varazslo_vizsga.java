public class Varazslo_vizsga {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Currently the " + Thread.currentThread().getName() + " thread is running!");

        Thread t1 = new Thread(new Jatszma());
        t1.setName("játszma");
        t1.start();

        try {

            t1.join();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Thread t2 = new Thread(new Eredmeny());
        t2.setName("eredmény");
        t2.start();

        try {

            t2.join();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Jatszma jatszma = new Jatszma();
        //jatszma.start();

        //testing inctance creation and getter setters

//        Harcos harcos = new Harcos();
//        Varazslo varazslo = new Varazslo();
//
//        System.out.println("A harcos élete: " + harcos.getElet());
//        System.out.println("A varazsló élete: " + varazslo.getElet());
//        System.out.println("A harcos nevee: " + harcos.getNev());
//        System.out.println("A varazsló neve: " + varazslo.getNev());
//
//        harcos.tamadas(varazslo);
//        varazslo.tamadas(harcos);
//
//        System.out.println("A harcos élete: " + harcos.getElet());
//        System.out.println("A varazsló élete: " + varazslo.getElet());



    }
}
