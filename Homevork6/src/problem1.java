import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String World = scanner.nextLine();
        int x = scanner.nextInt();
        if (x >= World.length()) {
            System.out.println("out of bounds");
        }
        else
            System.out.println(World.charAt(x));

    }
}
