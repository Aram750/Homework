import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Hello = scanner.nextLine();
        String World = "";
        for (int i = Hello.length()-1;i >= 0;i--)
        {
            World = World + Hello.charAt(i);
        }
        if (Hello.equals(World)) {
            System.out.println("palindrome");
        } else
            System.out.println("not palindrome");
    }
}
