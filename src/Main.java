public class Main {
    public static void main(String[] args) {

        System.out.println("УСЛОВНЫЙ ОПЕРАТОР-2");

        System.out.println("Задание 1");
        int clientiOs = 1;
        if (clientiOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        System.out.println("Задание 2");
        int clientOs = 0;
        int clientDeviceYear = 2019;
        if (clientOs == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылкe .");
            } else {
                System.out.println("Установите  версию приложения для iOS по ссылкe .");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылкe .");
            } else {
                System.out.println("Установите  версию приложения для Android по ссылкe .");
            }
        }


        System.out.println("Задание 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным.");
        } else {
            System.out.println("Год не является високосным");
        }
        System.out.println("Задание 4");
        int distans = 95;
        int days = 1;

        if (distans > 20) {
            days++;
        }
        if (distans > 60) {
            days++;
        }
        System.out.println("Потребуется дней  " + days);

        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
        }
    }
    }




