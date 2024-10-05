// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int fRecursive(int n) {
      if (n < 3) {
return n ;
}
return fRecursive( n - 1) + 2 * fRecursive(n - 2) + 3 * fRecursive(n - 3);
}

    

    public static int fIterative(int n) {
        if ( n < 3) {
return n ;  }
int [] values = new int [ n + 1];
values [0] = 0;
values [1] = 1;
values [2] = 2;
    for ( int i = 3; i <= n ; i ++) {
values [ i ] = values [ i - 1] + 2 * values [ i - 2] + 3 * values [ i - 3];
}
    return values [ n ];
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Recursive: " + fRecursive(n));
        System.out.println("Iterative: " + fIterative(n));
    }
}
