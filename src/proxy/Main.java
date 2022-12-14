package proxy;

public class Main {
    public static void main(String[] args) {
        MyDB myDB = new MyDB("my_data_base");
        MyDBProxy myDBProxy = new MyDBProxy(myDB);
        myDBProxy.connect("localhost:666/");
        myDBProxy.connect("localhost:777/");
        myDBProxy.connect("localhost:666/");
    }
}