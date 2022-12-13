package adapter;

public class UsbAdapter implements IUsb {
    private ISD sdCard;
    public UsbAdapter(ISD sdCard) {
        this.sdCard = sdCard;
    }
    @Override
    public String readUsbData() {
        return this.sdCard.readCardData();
    }
}
