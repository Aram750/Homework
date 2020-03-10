import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean k = true;
        int a = scanner.nextInt();
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (a == array[i]) {
                k = false;
            System.out.println(i);
            break;
        }
        else
            k = true;

    }
        if (k == true)
            System.out.println(-1);
    }
}
