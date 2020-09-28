import java.util.Iterator;
import java.util.NoSuchElementException;
public class BackwardArrayIt implements Iterator<Integer> {
    /**
     * field of array.
     */
    private final int[] data;
    /**
     * field of counter.
     */
    private int point = 0;

    /**
     *
     * @param data object of array
     */
    public BackwardArrayIt(int[] data) {
        this.data = data;
    }

    /**
     *
     * @return true of false if exist one more element of array.
     */
    @Override
    public boolean hasNext() {
        return point < data.length;
    }

    /**
     * in block if we check next element.
     * @return next element of array
     */
    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return data[data.length - 1 - point++];
    }

    @Override
    public void remove() {

    }
}
