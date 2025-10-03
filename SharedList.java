import java.util.ArrayList;

public class SharedList {

    public boolean transferReady = false;

    private ArrayList<Integer> list = new ArrayList<>();

    public synchronized Integer get() {
        if (list.size() > 0) {
            return list.remove(0);
        }
        return null;
    }

    public synchronized void put(Integer value) {
        list.add(value);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}
