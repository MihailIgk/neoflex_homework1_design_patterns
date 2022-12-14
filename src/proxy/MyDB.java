package proxy;

public class MyDB implements IDB {
    final private String dbName;
    public MyDB(String dbName) {
        this.dbName = dbName;
    }
    @Override
    public void connect(String path)  {
        System.out.println("Новое подключение установлено");
    }
    public String getName() {
        return dbName;
    }
}
