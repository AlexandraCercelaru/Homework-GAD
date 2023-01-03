import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String name;
    private int frequency;
    private List<Adress> list;

    public Hobby(String name, int frequency, List<Adress> list) {
        this.name = name;
        this.frequency = frequency;
        this.list = list;
    }

    @Override
    public String toString() {
        return name + " " + list.toString();
    }
}
