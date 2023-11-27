import java.util.Arrays;

 public class homework9 {
    public static void main(String[] args) {
        task1();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();

        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // task 2

        Arrays.sort(arr);
        System.out.println("Минимальная сумма трат за день составила " + arr[arr.length - 1] + " рублей. Максимальная сумма трат за день составила … рублей " + arr[0]);

        //task 3

        double arithmeticMean = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + arithmeticMean + " рублей");

        //task 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int index1 = 0; index1 < reverseFullName.length; index1++) {
            int a = reverseFullName.length - index1 - 1;
            System.out.print(reverseFullName[a] + "");
        }
    }
}