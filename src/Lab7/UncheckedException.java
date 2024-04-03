package Lab7;

public class UncheckedException {
    /**
     * Constructor for objects of class Client
     */
    public UncheckedException(){
        //To do
    }

    public static void main(String[] args) {
        int i, n = 2;
        int a[] = new int[n];

        //Declare Scanner Object named input
        java.util.Scanner input = new java.util.Scanner(System.in);

        for (i=0; i<=n; i++){
            System.out.printf("a[%d] = ", i);
            a[i] = input.nextInt();
        }
    }

    /**
     * Write a description of class Client here.
     *
     * @author ( Name )
     * @version (a version number or a date)
     */
    public class MoreClass{
        public static void main(String[] args) {
            Object obj1 = new Object();
            System.out.println(obj1);

            Object obj2 = new Object(){
                public String toString(){
                        return "this is obj2";
                    }
                };
                System.out.println(obj2);
        }
    }

}
