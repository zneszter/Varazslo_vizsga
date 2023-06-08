public class Varazslo_vizsga {

    public static void main(String[] args) {
        System.out.println("Hello");

        Thread t1 = new Thread(new Jatszma());
        t1.setName("main thread");
        t1.start();

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
