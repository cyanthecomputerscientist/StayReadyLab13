

public class MySet<T>
{
    private final Integer size = 20;
    private T[] myArray;
    private Integer curInteger= 0;

    public MySet()
    {
        myArray =(T[]) new Object[size];
    }
    public MySet(Integer s)
    {
        myArray = (T[]) new Object[s];
    }
    public Boolean add(T type)
    {
        Boolean canAdd = false;

        return canAdd;
    }
    public Boolean remove(Integer index)
    {
        Boolean canRemove = false;
        return canRemove;
    }
    public Boolean remove(Object o)
    {
        Boolean canRemove = false;
        return canRemove;
    }
    public Boolean contains(Object o)
    {
        Boolean doesContain = false;
        return doesContain;
    }
    public Boolean isEmpty()
    {
        Boolean isEmpty = true;
        return isEmpty;
    }
    public Integer size()
    {
        Integer s = 0;
        return s;
    }
    public T[] getArray()
    {
        return myArray;
    }

}