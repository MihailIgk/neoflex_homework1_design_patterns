package singleton;

public class Main {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        LoggerSingleton logger = LoggerSingleton.getInstance();
        logger.add(class1)
              .add(class2);
        SomeThread thread1 = SomeThread.createAndStart();
        SomeOtherThread thread2 = SomeOtherThread.createAndStart();
        try {
            thread1.thread.join();
            thread2.thread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        logger.show();
    }
}