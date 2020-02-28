public class problem7 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = new int [5] ;
        for (int i=a.length-1;i >= 0;i--) {
            b[i]=a[i];
            System.out.println(b[i]);
        }
    }
}
