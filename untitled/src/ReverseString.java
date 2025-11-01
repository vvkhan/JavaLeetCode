
public class ReverseString {

    public String reverseString(String inputString) {
        if (inputString == null) {
            throw new IllegalArgumentException("Null input is not valid!");
        }

        StringBuilder reversed = new StringBuilder();
        char[] charArray = inputString.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed.append(charArray[i]);
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseString("banana"));
        System.out.println(rs.reverseString("Anna"));
        System.out.println(rs.reverseString("null"));
        System.out.println(rs.reverseString("Hello!"));
        System.out.println(rs.reverseString(null));
    }
}
