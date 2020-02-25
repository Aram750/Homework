import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int i = scanner.nextInt();
        int n = 0;
        int z;
        while (n < 10) {
            n++;
            z = i * n;
            System.out.println(i + "*" + n + "=" + z);
        }
    }
}
