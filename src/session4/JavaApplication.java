package session4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaApplication {

    /**
     * Khối lệnh try catch finally
     * try{
     * //Code có thể ném ra ngoại lệ
     * }catch(Exception_class_name e){
     * //code xử lí ngoại lệ
     * }finally{
     * //Code trong khối này luôn dc thực thi
     * }
     * <p>
     * <p>
     * Một số phương thức (method) của Lớp Exception
     * getMessage(): trả về 1 message cụ thể về exception đã xảy ra
     * getCause():Trả về nguyên nhân xảy ra exception(exp)
     * toString():Trả về tên của lớp và kết hợp với kết quả trả về từ phương thức getMessage()
     * printStackTrace():In ra kết quả của phương thức toString cùng với Stack trace đến System.err
     * fillInStackTrace():Làm đầy stack trace của đối tượng Throwable bằng stack trace hiện tại.
     * <p>
     * <p>
     * **********************
     * Throw và Throws
     * <p>
     * TỪ khóa Throw trong java dc sử dụng để ném ra 1 ngoại lệ(exp) cụ thể
     * Chúng ra có thể ném ra 2 ngoại lệ checked và unchecked trong java ằng từ khóa Throw. Từ khóa Throw
     * chủ yếu dc sử dụng để ném ra ngoại lệ tùy chỉnh (ngoại lệ tùy chỉnh do người dùng định nghĩa).
     * Sau throw là 1 hoặc nhiều instance. Không thể throw nhiều exception
     * <p>
     * Từ khóa Throws:
     * Từ khóa Throws trong java được sử dụng khi bạn không muốn phải xây dựng try catch bên trong
     * một phương thức naào đó. Bạn "đẩy trách nhiệm" phải try catch này cho phương thức nào đó bên ngoài
     * có gọi đến nó phải try catch giúp bạn. Sau throws là 1 hoặc nhiều class. Có thể Khai báo nhiều
     * exception. Ví dụ: public void methodName() throws IOException,SQLException{...}
     */


    public static void main(String[] args) {
        // ThrowDemo.validate();
        //ThrowsDemo.getAge();
        //Custom exception
        try {
            int age = inputAge();
            System.out.println(("Tuoi da nhap: " + age));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static int inputAge() throws AgeCheckingExc {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tuoi cua ban: ");
        int age = 0;
        try {
            age = scanner.nextInt();
            if (age < 0) throw new AgeCheckingExc("Tuoi ko dc nho hon 0");
        } catch (InputMismatchException e) {
            throw new AgeCheckingExc("Tuoi phai la 1 so ( Number )");
        }
        return age;
    }
}