public class homework7 {
    public static void main(String[] args) {

        //task 1

        int monthlyFee = 15000;
        int goal = 2_459_000;
        int total = 0;
        int monthlyNomber = 0;

        while (total < goal) {
            total += monthlyFee;
            monthlyNomber++;
            System.out.println("Месяц " + monthlyNomber + ", сумма накоплений равна " + total + " рублей");
        }
        //task 2

        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        //task 3
        System.out.println();

        double yPopulation = 12_000_000;
        byte yMortality = 8;
        byte yBirth = 17;
        int distance = 10;
        i = 0;

        double populationGrowthRate = (yBirth - yMortality);
        populationGrowthRate /= 1000; // я не понимаю почему мне не дает это сделать в одну строчку, в 36 или в 31 и 32

        while (i != distance) {
            i++;
            yPopulation = yPopulation + yPopulation * populationGrowthRate;

            System.out.println("Год " + i + ", численность населения составляет " + (int) yPopulation);
        }
        //task 4&5

        double deposit = 15000;
        int totalGoal = 12_000_000;
        double interest = 0.07;
        i = 0;

        while (deposit < totalGoal) {
            deposit = deposit + (deposit * interest);
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + (int) deposit + " рублей");
            }
        }
        System.out.println("Месяцев для накопления 12кк нужно " + i + ", сумма накоплений равна " + (int) deposit + " рублей");
        //task 6

        double deposit2 = 15000;
        int investmentPeriodYears = 9;
        int investmentPeriodMonths = investmentPeriodYears * 12;
        double interest2 = 0.07;
        i = 0;

        while (i < investmentPeriodMonths) {
            deposit2 = deposit2 + (deposit2 * interest2);
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + (int) deposit2 + " рублей");
            }
        }
        //task 7

        int fridayIndex = 4;

        for (int dayNumber = 1; dayNumber <= 31; dayNumber++) {
            if ((dayNumber - fridayIndex) % 7 == 0) {
                System.out.println("Сегодня пятница, " + dayNumber + "-е число. Необходимо подготовить отчет");
            }
        }
        //task 8

        int date = 2023;
        int period1 = 200;
        int period2 = 100;

        for (int year = 0; year < (date + period2); year += 79) {
            if (year >= (date - period1)) {
                System.out.println(year);
            }
        }
    }
}
