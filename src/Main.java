public class Main {


    public static void main(String[] args) {
        task6();
    }

    public static void task6() {
        System.out.println("Задача 6.переменные");
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = Math.abs(a * (b + (c - d * e)));
        System.out.println(result);
        task7();

    }

    public static void task7() {
        int a = 5;
        int b = 7;
        a = 7;
        b = 5;
        System.out.println("Задача 7.переменные");
        System.out.println("a=" + a + " b=" + b);
        task8();
    }

    public static void task8() {
        System.out.println("Задача 8.переменные");
        int a = 573;
        int c = a % 100;
        int d = c / 10;
        int b = d;
        System.out.println("a=" + a + " b=" + b);
    }

}


