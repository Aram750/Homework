import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
         int ages[]= new int [] {25,36,46,-46,59};
         for(int i = 0; i < n;i++) {
             System.out.println(ages[i]);
         }
    }
}

