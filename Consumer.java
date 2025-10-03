public class Consumer implements Runnable {

    private SharedList sharedList;
    public String name;

    public Consumer(SharedList sharedList, String name) {
        this.sharedList = sharedList;
        this.name = name;
    }

    @Override
    public void run() {
        while (this.sharedList.transferReady == false || !this.sharedList.isEmpty()) {
            String value = sharedList.get();
            if (value != null) {
                System.out.println("[" + name + "] Consumed: " + value);
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
