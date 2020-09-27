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
    private int point = 100;

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
        return point >= 0;
    }

    /**
     * in block if we check next element.
     * @return next element of array
     */
    @Override
    public Integer next() {
        if (point == 100) {
            point = data.length - 1;
                         }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        return data[point--];
    }

    @Override
    public void remove() {

    }
}
