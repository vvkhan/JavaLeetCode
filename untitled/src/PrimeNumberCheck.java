public class PrimeNumberCheck {

    public boolean isPrime(int number) {
        if (number == 0 || number == 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumberCheck pmc = new PrimeNumberCheck();
        System.out.println(pmc.isPrime(0));
        System.out.println(pmc.isPrime(1));
        System.out.println(pmc.isPrime(2));
        System.out.println(pmc.isPrime(19));
        System.out.println(pmc.isPrime(110));
    }
}
