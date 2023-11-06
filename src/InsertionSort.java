import java.util.concurrent.ThreadLocalRandom;

public class InsertionSort {

    int[] array;

    InsertionSort(int size) {
        this.array = new int[size];
        for (int i = 0; i < size-1; i++) {
            this.array[i] = ThreadLocalRandom.current().nextInt(-1000, 1000);
        }
    }

    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Индекс [" + i + "]: " + array[i]);
        }
    }

    public void insertionSort() {
        int temp;
        int j;
        for (int i = 1; i < array.length ; i++) {
            temp = array[i];
            j = i;
            while (j > 0 && array[j-1] >= temp) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
        }
    }
}
