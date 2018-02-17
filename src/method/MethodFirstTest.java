package method;

import java.util.Scanner;

public class MethodFirstTest {

    public static void main(String[] args) {
        String name = read();
        print(name);
    }

    public static void print(String s) {
        System.out.print(s);
    }

    public static String read() {
        Scanner in = new Scanner(System.in);
        System.out.print("Name:");
        return in.nextLine();
    }
}