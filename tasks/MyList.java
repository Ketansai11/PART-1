import java.util.Arrays;

class MyList<T> {
    private T[] array;
    private int size;     

    @SuppressWarnings("unchecked")
    public MyList() {
        array = (T[]) new Object[100];
        size = 0;
    }
    public void add(T value) {
        if (size >= array.length) {
            throw new RuntimeException("List is full");
        }
        array[size++] = value;
    }
    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null; 
    }
    public boolean deleteByValue(T value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                deleteByIndex(i);
                return true;
            }
        }
        return false; 
    }
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return array[index];
    }
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, size));
    }
    public int getSize() {
        return size;
    }
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }
}
