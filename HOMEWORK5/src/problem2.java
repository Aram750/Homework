import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       int [] ages = new int[n];
        for (int i= 0;i < n;i++ ) {
            System.out.println("ages[" + i + "]");
            ages[i]= scanner.nextInt();
        }
    }
}

