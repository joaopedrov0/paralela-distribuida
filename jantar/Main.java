public class Main {
    static public void main (String ... args) {
        Consumer emma = new Consumer("Emma Ayers");
        Consumer callan = new Consumer("Callan");
        Consumer rhanny = new Consumer("Rhanny Gallahar");
        Consumer bryana = new Consumer("Bryana");

        Thread t1 = new Thread(emma);
        Thread t2 = new Thread(callan);
        Thread t3 = new Thread(rhanny);
        Thread t4 = new Thread(bryana);
        
        emma.setNext(callan);
        callan.setNext(rhanny);
        rhanny.setNext(bryana);
        bryana.setNext(emma);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}