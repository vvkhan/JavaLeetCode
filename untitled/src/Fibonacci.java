public class Fibonacci {
    
    public void fibonacciLoop(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Argument must be equal or greater than zero");
        }
        int a = 0;
        int b = 1;
        int c = 1;
        while (count > 0) {
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;
            count--;
        }
    }

    public int fibonacciRecurison(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Argument must be equal or greater than zero");
        }
        if (count <= 1) {
            return count;
        }
        return (fibonacciRecurison(count-1) + fibonacciRecurison(count-2));
    }

    public static void main(String[] arg) {
        Fibonacci fib = new Fibonacci();

        System.out.println("Fibonacci Loop");
        fib.fibonacciLoop(10);

        System.out.println("");

        System.out.println("Fibonacci Recursion");
        for (int i = 0; i < 10; i++) {
            System.out.print(fib.fibonacciRecurison(i) + ", ");
        }
    }
}
