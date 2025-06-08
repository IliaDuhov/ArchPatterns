package adapter;

public class MemoryCard implements IMemoryCard{

    @Override
    public void read() {
        System.out.println("Info from memory card has been read");
    }
}
