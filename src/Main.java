public class Main {
    public static void main(String[] args) {

        //Задача № 1
        System.out.println("Задача № 1");
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            System.out.println();
        }
        //Задача № 2
        System.out.println("Задача № 2");
        System.out.println();
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println();
        //Задача № 3
        System.out.println("Задача № 3");
        System.out.println();
        for (int i = 0; i <= 17; i++) {
            System.out.println(i++);
            System.out.println();
        }
        //Задача № 4
        System.out.println("Задача № 4");
        System.out.println();
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
            System.out.println();
        }
        //Задача № 5
        System.out.println("Задача № 5");
        System.out.println();
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + "год является високосным");
            System.out.println();
        }
        //Задача № 6
        System.out.println("Задача № 6");
        System.out.println();
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
            System.out.println();
        }
        //Задача № 7
        System.out.println("Задача № 8");
        System.out.println();
        int own = 1;
        System.out.println(own);
        for (int i = 2; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println();
        //Задача № 8
        System.out.println("Задача № 8");
        System.out.println();
        int many = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + many;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
        //Задача № 9
        System.out.println("Задача № 9");
        System.out.println();
        int contribution = 29000;
        int all = 0;
            for (int i = 1; i <= 12; i++) {
            all = all + contribution / 100;
            all=all+contribution;
            System.out.println("Месяц " + i + " сумма накоплений равна " + all + " рублей");
        }
    }}