public class SwapTwoNums {

    // Swap two nums without using the third variable
    public void swapTwoNums(int a, int b) {
        System.out.println("Initially a = " + a + "; b = " + b);

        b = b + a;
        // System.out.println("Then b = b + a, so b = " + b);
        a = b - a;
        // System.out.println("Then a = b - a, so a = " + a);
        b = b - a;
        // System.out.println("Then b = b - a, so b = " + b);

        System.out.println("Now a = " + a + "; b = " + b);
    }

    public static void main(String[] args) {
        SwapTwoNums stn = new SwapTwoNums();
        stn.swapTwoNums(1, 3);
        stn.swapTwoNums(4, 11);
        stn.swapTwoNums(0, 10);
        stn.swapTwoNums(99, 1);
    }
}
