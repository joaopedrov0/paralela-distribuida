public class Main {

    public static void main(String[] args) {
       
        //! Região crítica
        SharedList sharedList = new SharedList();

        Thread t1 = new Thread(new Producer(sharedList, "t1"));
        Thread t2 = new Thread(new Producer(sharedList, "t2"));
        Thread t3 = new Thread(new Producer(sharedList, "t3"));
        Thread t4 = new Thread(new Producer(sharedList, "t4"));
        Thread t5 = new Thread(new Producer(sharedList, "t5"));
        Thread t6 = new Thread(new Producer(sharedList, "t6"));
        Thread t7 = new Thread(new Producer(sharedList, "t7"));
        Thread t8 = new Thread(new Producer(sharedList, "t8"));
        Thread t9 = new Thread(new Producer(sharedList, "t9"));
        Thread t10 = new Thread(new Producer(sharedList, "t10"));

        Thread t11 = new Thread(new Consumer(sharedList, "t11"));
        Thread t12 = new Thread(new Consumer(sharedList, "t12"));
        Thread t13 = new Thread(new Consumer(sharedList, "t13"));
        Thread t14 = new Thread(new Consumer(sharedList, "t14"));
        Thread t15 = new Thread(new Consumer(sharedList, "t15"));
        Thread t16 = new Thread(new Consumer(sharedList, "t16"));
        Thread t17 = new Thread(new Consumer(sharedList, "t17"));
        Thread t18 = new Thread(new Consumer(sharedList, "t18"));
        Thread t19 = new Thread(new Consumer(sharedList, "t19"));
        Thread t20 = new Thread(new Consumer(sharedList, "t20"));
        


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();
        t13.start();
        t14.start();
        t15.start();
        t16.start();
        t17.start();
        t18.start();
        t19.start();
        t20.start();

    }
    
}