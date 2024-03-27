public class FibonacciSeriesGenerator {
    public static void main(String[] args) {
        int n = 10; // Change this to your desired number
        int a = 0, b = 1;
        System.out.print("Fibonacci Series for n = " + n + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
