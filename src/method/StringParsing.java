package method;

public class StringParsing {
    public static void main(String[] args) {
        String string = "Ivanitskii Pavel";
        printChars(string);
        int quantity = calculateCharsQuantity(string, 'i');
        System.out.println("Char quantity: " + quantity);
    }

    public static void printChars(String string) {
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

    public static int calculateCharsQuantity(String string, char condition) {
        int quantity = 0;
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == condition){
                quantity = quantity + 1;
            }
        }
        return quantity;


    }
}
