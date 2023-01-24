package Ex2;

import java.util.List;

public class ImmutableList<T> extends MyList<T> {
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

}
