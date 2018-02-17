package method;

import java.util.Scanner;

public class MethodFirstTest {

    public static void main(String[] args) {
        String name = read("Name: ");
        String lastName = read("Last Name: ");
        print(name + " " + lastName);
    }

    public static void print(String string) {
        System.out.println(string);
    }

    public static String read(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}