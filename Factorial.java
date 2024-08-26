public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Basis rekursi: faktorial dari 0 adalah 1
        } else {
            return n * factorial(n - 1); // Panggilan rekursif
        }
    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("5! = " + result);
    }
}

