import java.util.Scanner;
public class Class {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in);
        System.out.println("Hello, what's your name?");
        String firstName = scan.nextLine();
        System.out.println("Hello,\t" + firstName);
    }
}
