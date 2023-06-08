import java.util.Random;


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
            System.out.println("Currently the " + Thread.currentThread().getName() + " is running!");
            while (harcos.getElet() > 0 && varazslo.getElet() > 0 ) {
//

                harcos.setPozicio(harcos.lep());
                varazslo.setPozicio(varazslo.lep());

                //Testing getter for Pozició
//                System.out.println(Thread.currentThread().getName() + "A harcos(" + harcos.getNev() + ") poziciója: " + harcos.getPozicio());
//                System.out.println(Thread.currentThread().getName() + "A varazsló(" + varazslo.getNev() + ") poziciója: " + varazslo.getPozicio());

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
//            System.out.println("Harcos gyozelmek: " + Karakter.H_GYOZELEM);
//            System.out.println("Varazslo gyozelmek: " + Karakter.V_GYOZELEM);
//            System.out.println("Döntetlen: " + Karakter.HV_DONTETLEN);

        }
        catch (Exception e) {
            System.out.println("Hoppáááá! " + e.getMessage());

        }
        System.out.println("A játéknak vége!");

    }

    public String eredmeny() {
        String eredmeny = "Döntetlen";
        if (harcos.getElet() > varazslo.getElet()) {
            eredmeny = "\n" + "A harcos gözött!";
            //harcos.setGyozelem();
            Karakter.H_GYOZELEM = Karakter.H_GYOZELEM+1;
        }
        if (harcos.getElet() < varazslo.getElet()) {
            eredmeny = "\n" + "A varázsló gözött!";
            //varazslo.setGyozelem();
            Karakter.V_GYOZELEM = Karakter.V_GYOZELEM+1;
        }

        Karakter.HV_DONTETLEN = Karakter.HV_DONTETLEN + 1;
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
