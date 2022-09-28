import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println("Задание 2");
        int maxExpense = arr[0];
        for (int element : arr) {
            if (element > maxExpense) {
                maxExpense = element;
            }
        }
        System.out.println("Максимальная трата составляет " + maxExpense + " рублей.");

        int minExpense = arr[0];
        for (int element : arr) {
            if (element < minExpense) {
                minExpense = element;
            }
        }
        System.out.println("Минимальная трата составляет " + minExpense + " рублей.");

        System.out.println("Задание 3");
        float average = (float) sum / arr.length;
        System.out.print("Средняя трата за месяц составила ");
        System.out.printf("%.2f", average);
        System.out.println(" рублей.");

        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = reverseFullName.length - 1; index >= 0; index--) {
            System.out.print(reverseFullName[index]);
        }
        System.out.println();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}