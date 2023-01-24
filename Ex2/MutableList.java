package Ex2;

import java.util.List;

public class MutableList<T> extends MyList<T> {
    List<T> list;

    public List<T> getList() {
        return list;
    }

    public int getSize() {
        return list.size();
    }

    public T get(int index) {
        return list.get(index);

    }

    public void set(int index, T value) {
        list.set(index, value);

    }

    public void add(T value) {
        list.add(value);
    }

    public void remove(T value) {
        list.remove(value);
    }
}
