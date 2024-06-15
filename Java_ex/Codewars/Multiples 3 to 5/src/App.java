public class App {
    public static void main(String[] args) {
        int sum = 0;
        int number = 60;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
