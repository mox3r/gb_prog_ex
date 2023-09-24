public class App {
    public static void main(String[] args) throws Exception {
        int counter = 0;
        for (int i = 1; i < 100000000; i++) {
            boolean isPrime = true;
            if (i > 10) {
                if (i % 2 == 0 || i % 10 == 5) {
                    continue;
                }
            }
            for (int j = 2; j <= i / 2; j++) {
                if (j > Math.sqrt(i) + 1) {
                    break;
                }
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                // System.out.print(i + " ");
                counter++;
            }
        }
        System.out.print(counter);
    }
}
