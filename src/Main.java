public class Main {
    public static void main(String[] args) {

    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8();
    }
    public static void task1(){
        System.out.println(" ");
        System.out.println("Exercise 1");

        int total = 0;
        int purpose = 2459000;
        int contribution = 15000;
        int month = 0;

        while (total < purpose){
            total += contribution;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Всего потребуется месяцев " + month);
    }
    public static void task2(){
        System.out.println(" ");
        System.out.println("Exercise 2");

        int i = 0;

        while (i < 10){
            i++;
            System.out.print(i + " ");
        }
        System.out.println( );
        for ( ; i > 0; i--){
            System.out.print(i + " ");
        }
    }
    public static void task3(){
        System.out.println(" ");
        System.out.println("Exercise 3");

        int birthrate = 17;
        int mortality = 8;
        int year = 0;
        int populationY = 12_000_000;
        int populationGrowth;

        while (year < 10){
            populationGrowth = populationY/1000*birthrate - populationY/1000*mortality;
            populationY += populationGrowth;
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + populationY);
        }
    }
    public static void task4(){
        System.out.println(" ");
        System.out.println("Exercise 4");

        int purpose = 12_000_000;
        int contribution = 15_000;

        for (int i = 1; contribution < purpose; i++){
            contribution = contribution + (contribution/100 *7);
            System.out.println("Месяц вклада " + i + ". Денег на счету: " + contribution);
        }
    }
    public static void task5(){
        System.out.println(" ");
        System.out.println("Exercise 5");

        int purpose = 12_000_000;
        int contribution = 15_000;

        for (int i = 1; contribution < purpose; i++) {
            contribution = contribution + (contribution / 100 * 7);
            if (i % 6 == 0) {
                System.out.println("Месяц вклада " + i + ". Денег на счету: " + contribution);
            }
        }
    }
    public static void task6(){
        System.out.println(" ");
        System.out.println("Exercise 6");

        int years = 9;
        int contribution = 15_000;

        for (int i = 1; i < years * 12; i++){
            contribution += contribution / 100 * 7;
            if (i % 6 == 0){
                System.out.println("Месяц вклада: " + i + ". Сумма на счету " + contribution);
            }
        }
    }
    public static void task7(){
        System.out.println(" ");
        System.out.println("Exercise 7");

        int friday = 1;

        for (int i = 1; i < 30; i++){
            if ((i - friday) % 7 == 0){
                System.out.println("Сегодня пятница, " + i + " -е число. Необходимо подготовить отчет.");
            }
        }
    }
    public static void task8(){
        System.out.println(" ");
        System.out.println("Exercise 8");

        int firstYearComet = 1896;
        while (firstYearComet < 2300){
            System.out.println("Сегодня " + firstYearComet + " -ый год. Будет пролетать комета.");
            firstYearComet += 79;
            System.out.println("В следующий раз комета прилетит - " + firstYearComet + " год.");
        }
    }
}