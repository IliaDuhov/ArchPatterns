package proxy;

public class Database implements IDatabase{

    private final String name = "database";
    @Override
    public String connect() {
        return name;
    }
}
