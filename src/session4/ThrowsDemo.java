package session4;

import java.io.IOException;
import java.util.Scanner;

public class ThrowsDemo {
    //Chỗ này ct ko muốn sử dụng try catch để xử lý mà ta sẽ ấy trách nhiệm
    //cho phương thức khác
    public static int inputAge() throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tuoi cua ban:");
        int age = scanner.nextInt();
        if ( age <= 0) throw new IOException("Tuoi khong dc nho hon 0");
        return age;
    }
    public static void getAge(){
        try {
            int age = inputAge();
            System.out.println("Thuoi vua nhap: " +age);

        }catch (Exception e) {
        System.out.println("Tuoi khong phu hop.");
        }
    }
}
