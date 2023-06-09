public class MultithreadEredmeny implements Runnable {

        @Override
        public void run() {
            //for (int i = 0; i < Karakter.OSSZES; i++) {

            try {
                System.out.println("Jelenleg az " + Thread.currentThread().getName() + " szál fut!");


                Eredmeny eredmeny = new Eredmeny();
                eredmeny.start();



            } catch (Exception e) {
                System.out.println("Hopááá!" + e.getMessage());

            }

            }
        //}


}
