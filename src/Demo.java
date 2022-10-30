import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before Insertion Sort: ");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("After Insertion Sort: ");
        printArray(numbers);

    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.println(numbers[i]);
        }
    }

    private static void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            int currentValue = inputArray[i];
            int j = i - 1;
            while (j >= 0 && inputArray[j] > currentValue) {
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = currentValue;
        }
    }
}
