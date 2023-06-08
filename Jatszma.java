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
        }
        catch (Exception e) {
            System.out.println("Valami van itt");

        }
        System.out.println("A játék vége!");
    }
}
