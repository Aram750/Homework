import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        int m, sum =0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n > 0) {
          m = n % 10;
          sum = sum + m;
          n = n / 10;
        }
        System.out.println(sum);
    }
}
