import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InsertionSort is;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int size = sc.nextInt();
        is = new InsertionSort(size);
        System.out.println("Создан следующий массив: ");
        is.display();
        is.insertionSort();
        System.out.println("Массив отсортирован:");
        is.display();
    }
}
