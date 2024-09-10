// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fRecursive(n - 1) + fRecursive(n - 2) + n;
        }
    }

    public static int fIterative(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, result = 0;
        for (int i = 2; i <= n; i++) {
            result = b + a + i;
            a = b;
            b = result;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Recursive: " + fRecursive(n));
        System.out.println("Iterative: " + fIterative(n));
    }
}
