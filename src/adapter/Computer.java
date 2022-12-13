package adapter;

public class Computer {
    public Computer() {
        System.out.println("Компьютер загружен");
    }
    public void readUsb(IUsb usb) {
        System.out.println("Чтение данных ...");
        System.out.println(usb.readUsbData());
    }
}
