package Ex2;

import java.util.List;

abstract public class MyList<T> {
    List<T> list;

    abstract public List<T> getList();

    abstract public int getSize();

    abstract public T get(int index);

}
