package proxy;

import java.util.HashSet;

public class MyDBProxy implements IDB {
    private final MyDB myDB;
    private final HashSet<String> cash;

    public MyDBProxy(MyDB myDB) {
        this.myDB = myDB;
        cash = new HashSet<>();
    }
    @Override
    public void connect(String path) {
        if(!cash.contains(path)) {
            myDB.connect(path);
            cash.add(path);
        }
        System.out.println("Подключение к базе данных " + path + myDB.getName() + " установлено");
    }
}
