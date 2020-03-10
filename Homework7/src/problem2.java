import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int p ;
        p = 100 * (a - b) /a;
        System.out.println(p);
    }
}
