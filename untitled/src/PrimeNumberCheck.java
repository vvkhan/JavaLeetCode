public class PrimeNumberCheck {

    public boolean isPrime(int number) {
        if (number == 0 || number == 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i < number; i=i+2) {
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
        System.out.println(pmc.isPrime(3));
        System.out.println(pmc.isPrime(5));
        System.out.println(pmc.isPrime(7));
        System.out.println(pmc.isPrime(9));
        System.out.println(pmc.isPrime(19));
        System.out.println(pmc.isPrime(110));
    }
}
