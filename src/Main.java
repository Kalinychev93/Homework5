public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 5");
        System.out.println(" ");

        System.out.println("Task 1");
        int clientOs = 1;

        switch (clientOs) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
        System.out.println(" ");


        System.out.println("Task 2");
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015) {
            switch (clientOs) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
        } else {
            switch (clientOs) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }
        }
        System.out.println(" ");


        System.out.println("Task 3");
        int year = 1964;
        int leapYear1 = 4;
        int leapYear2 = 100;
        int leapYear3 = 400;
        int checkLeapYear1 = year % leapYear1;
        int checkLeapYear2 = year % leapYear2;
        int checkLeapYear3 = year % leapYear3;

        if(checkLeapYear3 == 0){
            System.out.println(year + " год является високосным");
        } else if (checkLeapYear1 == 0 && checkLeapYear2 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год  не является високосным");
        }
        System.out.println(" ");

        System.out.println("Task 4");
        int deliveryDistance = 100;
        int deliveryPeriod = 1 + (19 + deliveryDistance)/40;
        System.out.println("Для доставки в пределах " + deliveryDistance + " км потребуется дней: " + deliveryPeriod);
        System.out.println(" ");

        System.out.println("Task 5");
        int monthNumber = 12;
        switch(monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
                break;
            default:
        }
        System.out.println(" ");

        System.out.println(" Additional task 6*");
        int age = 29;
        double salary = 58_000;
        if(age < 23 && age > 0){
            if (salary > 0 && salary <50_000){
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (2 * salary) + " рублей");
            } else if (salary >= 50_000 && salary < 80_000){
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (2 * salary * 1.2) + " рублей");
            } else {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (2 * salary * 1.5) + " рублей");
            }
        } if (age >= 23){
            if (salary > 0 && salary <50_000){
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (3 * salary) + " рублей");
            } else if (salary >= 50_000 && salary < 80_000){
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (3 * salary * 1.2) + " рублей");
            } else {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (3 * salary * 1.5) + " рублей");
            }
        }
        System.out.println(" ");
        System.out.println("Additional task 7* ");
        double age1 = 25;
        double salary1 = 60000;
        String salaryForConsole1 = String.format("%.2f",salary1);
        double wantedSum = 330000;
        double interestRate = 0.1;
        double interestRate1 = 0.1 + 0.01;         //ставка кредита, если клиенту < 23 лет и зп < 80 тыс.
        double interestRate2 = 0.1 + 0.01 - 0.07;  //ставка кредита, если клиенту < 23 лет и зп > 80 тыс.
        double interestRate3 = 0.1 + 0.005;        //ставка, если клиенту от 23 до 30 лет и зп < 80 тыс.
        double interestRate4 = 0.1 + 0.005 - 0.07; //ставка, если клиенту от 23 до 30 лет и зп > 80 тыс.
        double interestRate5 = 0.1;                //ставка, если клиенту >= 30 лет и зп < 80 тыс.
        double interestRate6 = 0.1 - 0.07;         //ставка, если клиенту >= 30 лет и зп > 80 тыс.
        double maxPayment = 0.5 * salary1;
        String maxPaymentForConsole = String.format("%.2f",maxPayment);
        double payment1 = (wantedSum + wantedSum * interestRate1) / 12; //платеж, если клиенту < 23 лет и зп < 80 тыс.
        String paymentVar1 = String.format("%.2f",payment1);
        double payment2 = (wantedSum + wantedSum * interestRate2) / 12; //платеж, если клиенту < 23 лет и зп >= 80 тыс.
        String paymentVar2 = String.format("%.2f",payment2);
        double payment3 = (wantedSum + wantedSum * interestRate3) / 12; //платеж, если клиенту от 23 до 30 лет и зп < 80 тыс.
        String paymentVar3 = String.format("%.2f",payment3);
        double payment4 = (wantedSum + wantedSum * interestRate4) / 12; //платеж, если клиенту от 23 до 30 лет и зп >= 80 тыс.
        String paymentVar4 = String.format("%.2f",payment4);
        double payment5 = (wantedSum + wantedSum * interestRate5) / 12; //платеж, если клиенту >= 30 лет и зп < 80 тыс.
        String paymentVar5 = String.format("%.2f",payment5);
        double payment6 = (wantedSum + wantedSum * interestRate6) / 12;; //платеж, если клиенту >= 30 лет и зп >= 80 тыс.
        String paymentVar6 = String.format("%.2f",payment6);

        if (age1 <= 0 && salary1 <= 0){ //проверка на ошибки + з/п не должна быть равна 0
            System.out.println("Устройтесь, пожалуйста, на работу. Пока о кредите не может быть и речи");
        }
        if (age1 > 0 && age1 < 23 && salary1 > 0 && salary1 < 80000 && payment1 <= maxPayment){ // вариант 1.1 -  клиенту < 23 лет и зп < 80 тыс. и платеж по кредиту <= max
            System.out.println("Максимальный платеж при зарплате " + salaryForConsole1 + " равен " + maxPaymentForConsole + " рублей. Платеж по кредиту равен " + paymentVar1 + " рублей в месяц. Кредит одобрен.");
        }
        if (age1 > 0 && age1 < 23 && salary1 > 0 && salary1 < 80000 && payment1 > maxPayment){ // вариант 1.2 -  клиенту < 23 лет и зп < 80 тыс. и платеж по кредиту > max
            System.out.println("Максимальный платеж при зарплате " + salaryForConsole1 + " равен " + maxPaymentForConsole + " рублей. Платеж по кредиту равен " + paymentVar1 + " рублей в месяц. В кредите отказано.");
        }
        if (age1 > 0 && age1 < 23 && salary1 >= 80000 && payment2 <= maxPayment){ // вариант 2.1 -  клиенту < 23 лет и зп >= 80 тыс. и платеж по кредиту <= max
            System.out.println("Максимальный платеж при зарплате " + salaryForConsole1 + " равен " + maxPaymentForConsole + " рублей. Платеж по кредиту равен " + paymentVar2 + " рублей в месяц.Кредит одобрен.");
        }
        if (age1 > 0 && age1 < 23 && salary1 >= 80000 && payment2 > maxPayment){ // вариант 2.2 -  клиенту < 23 лет и зп >= 80 тыс. и платеж по кредиту > max
            System.out.println("Максимальный платеж при зарплате " + salaryForConsole1 + " равен " + maxPaymentForConsole + " рублей. Платеж по кредиту равен " + paymentVar2 + " рублей в месяц.В кредите отказано.");
        }
        if (age1 >= 23 && age1 < 30 && salary1 > 0 && salary1 < 80000 && payment3 <= maxPayment){ // вариант 3.1 -  клиенту от 23 до 30 лет и зп < 80 тыс. и платеж по кредиту <= max
            System.out.println("Максимальный платеж при зарплате " + salaryForConsole1 + " равен " + maxPaymentForConsole + " рублей. Платеж по кредиту равен " + paymentVar3 + " рублей в месяц.Кредит одобрен.");
        }
        if (age1 >= 23 && age1 < 30 && salary1 > 0 && salary1 < 80000 && payment3 > maxPayment){ // вариант 3.2 -  клиенту от 23 до 30 лет и зп < 80 тыс. и платеж по кредиту > max
            System.out.println("Максимальный платеж при зарплате " + salaryForConsole1 + " равен " + maxPaymentForConsole + " рублей. Платеж по кредиту равен " + paymentVar3 + " рублей в месяц.В кредите отказано.");
        }
        if (age1 >= 23 && age1 < 30 && salary1 >= 80000 && payment4 <= maxPayment){ // вариант 4.1 -  клиенту от 23 до 30 лет и зп >= 80 тыс. и платеж по кредиту <= max
            System.out.println("Максимальный платеж при зарплате " + salaryForConsole1 + " равен " + maxPaymentForConsole + " рублей. Платеж по кредиту равен " + paymentVar4 + " рублей в месяц.Кредит одобрен.");
        }
        if (age1 >= 23 && age1 < 30 && salary1 >= 80000 && payment4 > maxPayment){ // вариант 4.2 -  клиенту от 23 до 30 лет и зп >= 80 тыс. и платеж по кредиту > max
            System.out.println("Максимальный платеж при зарплате " + salaryForConsole1 + " равен " + maxPaymentForConsole + " рублей. Платеж по кредиту равен " + paymentVar4 + " рублей в месяц.В кредите отказано.");
        }
        if (age1 >= 30 && salary1 > 0 && salary1 < 80000 && payment5 <= maxPayment){ // вариант 5.1 -  если клиенту >= 30 лет и зп < 80 тыс. и платеж по кредиту <= max
            System.out.println("Максимальный платеж при зарплате " + salaryForConsole1 + " равен " + maxPaymentForConsole + " рублей. Платеж по кредиту равен " + paymentVar5 + " рублей в месяц.Кредит одобрен.");
        }
        if (age1 >= 30 && salary1 > 0 && salary1 < 80000 && payment5 > maxPayment){ // вариант 5.2 -  если клиенту >= 30 лет и зп < 80 тыс. и платеж по кредиту > max
            System.out.println("Максимальный платеж при зарплате " + salaryForConsole1 + " равен " + maxPaymentForConsole + " рублей. Платеж по кредиту равен " + paymentVar5 + " рублей в месяц.В кредите отказано.");
        }
        if (age1 >= 30 && salary1 >= 80000 && payment6 <= maxPayment){ // вариант 6.1 -  если клиенту >= 30 лет и зп >= 80 тыс. и платеж по кредиту <= max
            System.out.println("Максимальный платеж при зарплате " + salaryForConsole1 + " равен " + maxPaymentForConsole + " рублей. Платеж по кредиту равен " + paymentVar6 + " рублей в месяц.Кредит одобрен.");
        }
        if (age1 >= 30 && salary1 >= 80000 && payment6 > maxPayment){ // вариант 6.2 -  если клиенту >= 30 лет и зп >= 80 тыс. и платеж по кредиту > max
            System.out.println("Максимальный платеж при зарплате " + salaryForConsole1 + " равен " + maxPaymentForConsole + " рублей. Платеж по кредиту равен " + paymentVar6 + " рублей в месяц.В кредите отказано.");
        }
    }
}