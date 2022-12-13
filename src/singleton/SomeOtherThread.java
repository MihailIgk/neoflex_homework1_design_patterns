package singleton;

public class SomeOtherThread implements Runnable {
    Thread thread;
    SomeOtherThread() {
        thread = new Thread(this);
    }
    @Override
    public void run() {
        LoggerSingleton logger = LoggerSingleton.getInstance();
        logger.add(this);
    }
    public static SomeOtherThread createAndStart() {
        SomeOtherThread thr = new SomeOtherThread();
        thr.thread.start();
        return thr;
    }
}
