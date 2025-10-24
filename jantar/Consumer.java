import java.util.Random;

public class Consumer implements Runnable {
    
    private final Random random = new Random();
    private Consumer next;
    private final String name;

    public Consumer(String name){
        this.name = name;
    }

    public void setNext(Consumer next){
        this.next = next;
    }
    
    public void consume(){
        long timeToConsume = this.random.nextLong(5000, 10000);

        try {
            Thread.sleep(timeToConsume);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

        if (next != null) {
            synchronized (next) {
                next.notify();
            }
        }

        synchronized (this) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    
    @Override
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println(name + " started eating for the " + (i+1) + "° time.");
            this.consume();
            System.out.println(name + " finished eating.");
        }
    }
}