import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");

        proverkaVisokosnosti(2024);
        proverkaVisokosnosti(2025);
        proverkaVisokosnosti(100);

        // Задача 2
        System.out.println();
        System.out.println("Задача 2");

        proverkaOS(1, 2024);
        proverkaOS(1, 2023);
        proverkaOS(0, 2024);
        proverkaOS(0, 2023);

        // Задача 3
        System.out.println();
        System.out.println("Задача 3");

        System.out.println("Потребуется дней: " + proverkaDostavki(19));
        System.out.println("Потребуется дней: " + proverkaDostavki(20));
        System.out.println("Потребуется дней: " + proverkaDostavki(25));
        System.out.println("Потребуется дней: " + proverkaDostavki(60));
        System.out.println("Потребуется дней: " + proverkaDostavki(64));
        System.out.println("Потребуется дней: " + proverkaDostavki(100));
        System.out.println("Потребуется дней: " + proverkaDostavki(110));
        System.out.println("Потребуется дней: " + proverkaDostavki(115));
    }

    public static void proverkaVisokosnosti(int year) {
        if (year <= 1584) {
            System.out.println("В " + year + " году понятия 'високосный год' еще не существовало");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void proverkaOS(int clientOS, int clientDeviceYear) {
        String mobileOSName = switch (clientOS) {
            case 0 -> "iOS";
            case 1 -> "Android";
            default -> "неизвестная ОС";
        };

        int currentYear = LocalDate.now().getYear();

        if (clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для " + mobileOSName + " по ссылке");
        } else {
            System.out.println("Установите версию приложения для " + mobileOSName + " по ссылке");
        }
    }

    public static int proverkaDostavki(int deliveryDistance) {
        int deliveryDays;

        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = 0;
            System.out.println("Доставка не осуществляется");
        }
        return (deliveryDays);
    }
}