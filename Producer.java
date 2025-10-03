

public class Producer implements Runnable {

    private SharedList sharedList;
    public String name;

    public Producer(SharedList sharedList, String name) {
        this.sharedList = sharedList;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedList.put(String.format("%d from %s", i, name));
            System.out.println("[" + name + "] Produced: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.sharedList.transferReady = true;
    }

}
