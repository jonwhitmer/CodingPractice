import java.util.Random;

// LeetCode #384 (JPMC)
public class Shuffle {

    private final int[] original;
    private int[] array;
    private final Random rand;

    public Shuffle(int[] nums) {
        this.original = nums.clone();
        this.array = nums.clone();
        rand = new Random();
    }
    
    public int[] reset() {
        array = original.clone();
        return array;
    }

    public int[] shuffle() {
        // Fisher-Yates shuffle .. start at end of array, go to 1
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); // random number between 0 and i
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        return array;
    }
}