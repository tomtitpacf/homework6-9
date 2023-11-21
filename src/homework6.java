public class homework6 {
    public static void main(String[] args) {
        //task 1

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        //task 2

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //task 3

        for (int i = 0; i < 18; i = i + 2) {
            System.out.println(i);
        }
        //task 4

        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        //task 5

        for (int i = 1904; i < 2096; i = i + 2) {
            if (i % 100 != 0 ){
                System.out.println(i + " год является високосным");
            }
        }
        //task 6

        for (int i = 7; i < 100; i += 7) {
            System.out.println(i);
        }
        //task 7

        for (int i = 1; i < 513; i *= 2) {
            System.out.println(i);
        }
        //task 8 & 9

        int monthlyFee = 29000;
        int months = 12;
        int total = 0;
        int depositInterest = 12;

        for (int i = 1; i < months + 1; i++) {
            total += total / 100 * depositInterest;
            total += monthlyFee;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        //task 10

        for (int i = 1; i < 11; i++) {
            System.out.println("2*" + i + "=" + i*2);
        }
    }
}

