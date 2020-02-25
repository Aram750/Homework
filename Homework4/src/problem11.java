import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println();
        int x = 2;
        int y = 1;
        while (x < n/2) {
            if (n % x == 0) {
                y = 0;
            System.out.println(false);
            break;}
            else
                x++;
        }
        if (y == 1)
            System.out.println(true);
    }
}
