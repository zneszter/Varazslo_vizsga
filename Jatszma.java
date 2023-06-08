public class Jatszma {

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
                harcos.setPozicio(harcos.lep());
                varazslo.setPozicio(varazslo.lep());

                //Testing getter for Pozició
                System.out.println(harcos.getPozicio());
                System.out.println(varazslo.getPozicio());

                if (harcos.getPozicio() == varazslo.getPozicio()) {
                    System.out.println("\n" + "Támadás!!!!");
                    harcos.tamad(varazslo);
                    varazslo.tamad(harcos);
                }

                if (harcos.getElet() == varazslo.getElet()) {
                    throw new Exception("Egyszerre fogyott el az életük!!!");
                }

            }
            System.out.println(eredmeny()+"\n");
        }
        catch (Exception e) {
            System.out.println("Valami van itt" + e.getMessage());

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
}
