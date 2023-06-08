public class Jatszma extends Multithreading {

    Karakter harcos;
    Karakter varazslo;
    public Jatszma() {

        harcos = new Harcos();
        varazslo = new Varazslo();
    }

    public void start() {
        try {
            System.out.println("Üdvözöllek játékosok");
            while (harcos.getElet() > 0 && varazslo.getElet() > 0) {
//                Multithreading t1 = new Multithreading();
//                Thread m1 = new Thread(t1);
//                m1.setName("Harcos_thread");
//                m1.run();
//                Multithreading t2 = new Multithreading();
//                Thread m2 = new Thread(t2);
//                m2.setName("Varazslo_thread");
//                m2.run();

                harcos.setPozicio(harcos.lep());
                varazslo.setPozicio(varazslo.lep());

                //Testing getter for Pozició
                System.out.println(Thread.currentThread().getName() + "A harcos(" + harcos.getNev() + ") poziciója: " + harcos.getPozicio());
                System.out.println(Thread.currentThread().getName() + "A varazsló(" + varazslo.getNev() + ") poziciója: " + varazslo.getPozicio());

                if (harcos.getPozicio() == varazslo.getPozicio()) {
                    System.out.println("\n" + "Támadás!!!!");
                    harcos.tamad(varazslo);
                    varazslo.tamad(harcos);
                }

                if (harcos.getElet() == varazslo.getElet()) {
                    throw new Exception("Egyszerre fogyott el az életük. Döntetlen!!!");
                }

            }
            System.out.println(eredmeny()+"\n");
        }
        catch (Exception e) {
            System.out.println("Hoppáááá! " + e.getMessage());

        }
        System.out.println("A játék vége!");
    }

    public String eredmeny() {
        String eredmeny = "Döntetlen";
        if (harcos.getElet() > varazslo.getElet()) {
            eredmeny = "\n" + "A harcos gözött!";
        }
        if (harcos.getElet() < varazslo.getElet()) {
            eredmeny = "\n" + "A varázsló gözött!";
        }
        return eredmeny;
    }

//    @Override
//    public void run() {
//        System.out.println("Currently the " + Thread.currentThread().getName() + " is running!");
//        try {
//            Jatszma jatszma = new Jatszma();
//            jatszma.start();
//        } catch (Exception e) {
//            System.out.println("Hopááá!" + e.getMessage());
//
//        }
//    }
}
