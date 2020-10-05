import java.util.Iterator;
import java.util.NoSuchElementException;
public class EvenIt implements  Iterator<Integer> {
        /**
         * field of array.
         */
        private final int[] data;
        /**
         * field of counter.
         */
        private int point = 0;
        /**
         *constructor of object iterator that take array.
         * @param data object array
         */

        public EvenIt(int[] data) {
            this.data = data;
        }
        /**
         * Checker for all next element of array.
         * @return true if array contains even number
         * after checker or false when array doesnt contains even number
         */

        @Override
        public boolean hasNext() {
            while (point < data.length) {
                if (data[point] % 2 == 0) {
                    return true;
                }
                point++;
            }
            return false;
            }

        /**
         *
         * @return next element or increase counter
         */
        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return data[point++];
        }

        @Override
        public void remove() {

        }
}