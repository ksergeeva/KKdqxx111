import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    public Random random;
    public int min;
    public int max;

    protected Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            public boolean hasNext() {
                return true;
            }

            public Integer next() {
                return random.nextInt(max - min + 1) + min;
            }
        };
    }
}
