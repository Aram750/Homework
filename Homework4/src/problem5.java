public class problem5 {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;
        int z = 0;
        while (x <= y) {
                if (x % 9 == 0) {
                z = z + x;
                    System.out.println(x);
                    x++;
            }
                else
                    x++;
        }
        System.out.println(z);
    }
}