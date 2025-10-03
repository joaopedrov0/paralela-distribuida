public class Consumer implements Runnable {

    private SharedList sharedList;

    public Consumer(SharedList sharedList) {
        this.sharedList = sharedList;
    }

    @Override
    public void run() {
        while (this.sharedList.transferReady == false || !this.sharedList.isEmpty()) {
            Integer value = sharedList.get();
            if (value != null) {
                System.out.println("Consumed: " + value);
            } else {
                System.out.println("No item to consume");
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
