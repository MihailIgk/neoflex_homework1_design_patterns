package adapter;

public class UsbFlashDrive implements IUsb {
    @Override
    public String readUsbData() {
        return "Данные с USB-накопителя";
    }
}
