package adapter;

public class SDCard implements ISD {
    @Override
    public String readCardData() {
        return "Данные с карты памяти";
    }
}
