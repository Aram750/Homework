public class problem3 {
    public static void main(String[] args) {
       String s [] = new String  [] {"Aram"};
       String[] b = {"Aram","Arman","Armen","Tiko","Ero"};
       for (String i:b ) {
           if (s.equals(b)) {
               System.out.println(s);
           } else {
               System.out.println("Not found");
           }
       }
    }
}
