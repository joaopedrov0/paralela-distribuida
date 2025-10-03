public class Main {

    public static void main(String[] args) {
       
        SharedList sharedList = new SharedList();

        Thread t1 = new Thread(new Producer(sharedList));
        Thread t2 = new Thread(new Consumer(sharedList));

        t1.start();
        t2.start();


        // Thread t1 = new Thread(() -> {
        //     for (int i = 0; i < 5; i++) {
        //         System.out.println("Thread 1 - Count: " + i);
        //         try {
        //             Thread.sleep(1000);
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // });
        // Thread t2 = new Thread(() -> {
        //     for (int i = 0; i < 5; i++) {
        //         System.out.println("Thread 2 - Count: " + i);
        //         try {
        //             Thread.sleep(1000);
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // });

        // t1.start();
        // t2.start();
    }
    
}