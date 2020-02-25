public class problem6 {
    public static void main(String[] args) {
        double x = 2;
        double y = 2;
        double z = 1;
        while (y <= x) {
            z= z + 1/y;
            y++;
            System.out.println(z);
        }
    }
}
