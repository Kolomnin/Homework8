import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static int year = LocalDate.now().getYear();
    public static int clientOS = 1;
    public static int deliveryDistance = 50;
    public static String abraCadabra = "aabccddefgghiijjkk";
    public static int[] array = {5, 8, 2, 3, 9};
    public static void main(String[] args) throws ParseException {
        task1(year);
        task2(clientOS, year);
        task3(deliveryDistance);
        task4(abraCadabra);
        task5(array);
        task6();
    }
    private static void task1(int year) {
        System.out.println("Task1");

        if (year %100==0 && year %400 ==0 && year % 4 == 0) {
            System.out.println(year + " год является високосным");
        }
        else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        }
        else if (year % 100 == 0 && year % 4 == 0) {
            System.out.println(year + " год не является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();
    }

    private static void task2(int clientOS, int year) throws ParseException {
        System.out.println("Task2");

        Calendar calendar = new GregorianCalendar(2015, Calendar.JANUARY, 1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Date date = sdf.parse(String.valueOf(year));

        while (true) {
            if (clientOS == 0) {
                if (date.before(calendar.getTime())) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                } else if (date.after(calendar.getTime())) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                }
            } else if (clientOS == 1) {
                if (date.before(calendar.getTime())) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                } else if (date.after(calendar.getTime())) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                }
            }
        }
        System.out.println();
    }

    private static void task3(int deliveryDistance) {
        System.out.println("Task3");
        if (deliveryDistance <= 20) {
            int days = 1;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            int days = 2;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            int days = 3;
            System.out.println("Потребуется дней: " + days);
        }
        System.out.println();
    }

    public static void task4(String abraCadabra) {
       System.out.println("Task4");
       String abra = abraCadabra;
       char[] array = abra.toCharArray();
       StringBuilder build = new StringBuilder();
       for (int i = 0; i < array.length-1; i++) {
           if(array[i] == array[i+1]) {
                build.append(array[i]);
           }
       }
       System.out.println(build);
       System.out.println();
    }

    public static void task5(int[] array) {
        System.out.println("Task5");

        System.out.println(Arrays.toString(array));
        int[] reverse = new int[array.length];
        int x = 0;
        for (int i = 1; i <= array.length; i++) {
            reverse[x++] = array[array.length - i];
        }
        System.out.println(Arrays.toString(reverse));
        System.out.println();
    }

    private static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task6() {
        System.out.println("Task6");
        generateRandomArray();
        total();
        printTotal();
    }
    public static int total() {
        int sum = 0;
        int[] arr = generateRandomArray();
        for (int i = 0; i <arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void printTotal() {
        System.out.println("Сумма трат за месяц составила " + total() + " рублей");
    }
}