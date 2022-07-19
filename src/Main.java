public class Main {
    public static void main(String[] args) {
        int i = 0;
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (; i < 4; i++) {
            a = a + b;
            b = a + b;
            System.out.print(a + " ");
            System.out.print(b + " ");
        }


    }
}