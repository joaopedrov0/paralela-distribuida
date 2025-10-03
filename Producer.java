

public class Producer implements Runnable {

    private SharedList sharedList;

    public Producer(SharedList sharedList) {
        this.sharedList = sharedList;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedList.put(i);
            System.out.println("Produced: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.sharedList.transferReady = true;
    }

}
