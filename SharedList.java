import java.util.ArrayList;

//! Região crítica

public class SharedList {

    public boolean transferReady = false;

    private ArrayList<String> list = new ArrayList<>();

    public synchronized String get() {
        if (list.size() > 0) {
            return list.remove(0);
        }
        return null;
    }

    public synchronized void put(String value) {
        list.add(value);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}
