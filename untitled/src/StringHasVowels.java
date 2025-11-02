public class StringHasVowels {

    public boolean strHasVowels1(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Null is invalid input");
        }
        return input.toLowerCase().matches(".*[aeiouy].*");
    }

    public boolean strHasVowels2(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Null is invalid input");
        }
        if (input.toLowerCase().contains("a") || input.toLowerCase().contains("e") || 
            input.toLowerCase().contains("i") || input.toLowerCase().contains("o") || 
            input.toLowerCase().contains("u") || input.toLowerCase().contains("y")) {
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        StringHasVowels shv = new StringHasVowels();
        System.out.println(shv.strHasVowels1("Hello")); // prints true
        System.out.println(shv.strHasVowels1("TV")); // prints false

        System.out.println(shv.strHasVowels2("Hello")); // prints true
        System.out.println(shv.strHasVowels2("TV")); // prints false
    }
}
