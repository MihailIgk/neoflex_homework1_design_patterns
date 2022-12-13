package singleton;

public class SomeThread implements Runnable {
    Thread thread;
    SomeThread() {
        thread = new Thread(this);
    }
    @Override
    public void run() {
        LoggerSingleton logger = LoggerSingleton.getInstance();
        logger.add(this);
        logger.add(logger);
    }
    public static SomeThread createAndStart() {
        SomeThread thr = new SomeThread();
        thr.thread.start();
        return thr;
    }
}
