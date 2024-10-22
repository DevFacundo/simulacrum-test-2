package model;

import java.util.ArrayList;
import java.util.List;

public class GenericClass <T>{
    private List<T>list = new ArrayList<>();

    public GenericClass() {
    }

    public GenericClass(List<T> list) {
        this.list = list;
    }

    public void addToArray(T t)
    {
        list.add(t);
    }
    public void deleteInArray(T t)
    {
        list.remove(t);
    }
    public T getObject (Integer position)
    {
        if (position < 0 || position >= list.size()) {
            throw new IndexOutOfBoundsException("Posición fuera de los límites de la lista.");
        }else
        {
            return list.get(position);
        }
    }
}
