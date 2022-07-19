public class Main {
    public static void main(String[] args) {
        int cometFly = 79;
        int currentYear = 2022;
        for (int i = 0; i < currentYear+100; i = i + cometFly) {
            if (currentYear - 200 < i) {
                System.out.println(i);
            }
        }
    }
}