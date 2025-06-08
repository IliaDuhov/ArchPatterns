package adapter;

public class Usb implements IUsb{
    @Override
    public void read() {
        System.out.println("Info from usb has been read");
    }
}
