public class problem10 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int n = 6;
        int z = 2;
        int a = 0;
        while (z < n) {
            a = y + x;
            x = y;
            y = a;
            z++;
        }
        System.out.println(y);
    }
}
