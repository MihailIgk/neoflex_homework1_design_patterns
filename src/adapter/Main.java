package adapter;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        IUsb flashDrive = new UsbFlashDrive();
        computer.readUsb(flashDrive);

        ISD sdCard = new SDCard();
        IUsb adapter = new UsbAdapter(sdCard);
        computer.readUsb(adapter);
    }
}
