public class Q3PrintArrayBackwards {
    private static int[] array = {1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        printRecursion(array.length-1);
    }

    private static void printRecursion(int i) {
       if ( i < 0) {
return ;
}
System.out.println( array [i]);
  printRecursion ( i - 1);
    }
}
