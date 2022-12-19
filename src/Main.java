import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int salarySum = 0;
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString((salaryArray)));
        for (int salary: salaryArray) {
            salarySum += salary;
        }

        System.out.println("Сумма трат за месяц составила " + salarySum + " рублей");


        System.out.println("Задание 2");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int[] salaryArray0 = generateRandomArray();
        System.out.println(Arrays.toString((salaryArray0)));

        for (int salary: salaryArray0) {
            if (salary > max) {
                max = salary; }
            if (salary < min) {
                min = salary; }
            }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма затрат составила " + max + " рублей" );


        System.out.println("Задание 3");

        int days = 30;
        int sum = 0;

        int[] salaryArray1 = generateRandomArray();
        System.out.println(Arrays.toString((salaryArray1)));

        for (int salary: salaryArray1) {
            sum += salary;
        }

        double average= (double) sum / days;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");


        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int [30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt (100_000) + 100_000;
        }
        return arr;
        }

    }
