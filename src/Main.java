import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");

        proveritVisokosnost(2024);
        proveritVisokosnost(2025);
        proveritVisokosnost(100);

        // Задача 2
        System.out.println();
        System.out.println("Задача 2");

        proveritOS(1, 2024);
        proveritOS(1, 2023);
        proveritOS(0, 2024);
        proveritOS(0, 2023);

        // Задача 3
        System.out.println();
        System.out.println("Задача 3");

        System.out.println("Потребуется дней: " + proveritDostavky(19));
        System.out.println("Потребуется дней: " + proveritDostavky(20));
        System.out.println("Потребуется дней: " + proveritDostavky(25));
        System.out.println("Потребуется дней: " + proveritDostavky(60));
        System.out.println("Потребуется дней: " + proveritDostavky(64));
        System.out.println("Потребуется дней: " + proveritDostavky(100));
        System.out.println("Потребуется дней: " + proveritDostavky(110));
        System.out.println("Потребуется дней: " + proveritDostavky(115));
    }

    public static void proveritVisokosnost(int year) {
        if (year <= 1584) {
            System.out.println("В " + year + " году понятия 'високосный год' еще не существовало");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void proveritOS(int clientOS, int clientDeviceYear) {
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

    public static int proveritDostavky(int deliveryDistance) {
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