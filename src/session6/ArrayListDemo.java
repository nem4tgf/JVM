package session6;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void arrayListMethod(){
        //ArrayList tao  bang 2 cach
        //Cach 1:
        ArrayList<String> student = new ArrayList<>();

        //cach2:
        List<String> animal = new ArrayList<>();

        //Them ptu vao array list
        student.add("Ngoc");
        student.add("Linh");
        student.add("Hai");
        student.add("VI");
        student.add("Huyen");
        //System.out.println(student);
        display(student);
        System.out.println("==========================");
        student.add(2, "Thuy");
        display(student);
        System.out.println("==========================");
        student.addFirst("Hieu");
        student.addLast("Linh");
        display(student);
        int size = student.size();
        display(student);
        System.out.println("==========================");
        //lay 1 phan tu theo index
        String st = student.get(1);
        System.out.println("Phan tu co index = 1: " + st);
        //lay phan tu dau tien
        String firstStudent = student.getFirst();
        System.out.println("Sinh vien dau tien: "+firstStudent);
        System.out.println("==========================");
        //sua gia tri:
        student.set(4,"new name at index 4");
        System.out.println("The final list after updated");
        display(student);
        //Xoa phan tu dau tien va lay ra
        String firsr = student.removeFirst();
        //remove bat ki
        student.remove( 1);
        student.remove(":Linh");
        //xoa taon bo
        student.clear();
        size = student.size();
        System.out.println("Array sau khi clear: "+size);
        System.out.println("List cuoi sau khi clear");
        display(student);

    }

    public static void  display(ArrayList list){
       for (int i = 0; i < list.size(); i++){
           System.out.println(list.get(i));
       }

    }
    public static void show(ArrayList list){
        //Su dung foreach de tim thong tin
        for (Object arrList : list){
            System.out.println(arrList);
        }
    }

    public static void main(String[] args) {
//        ArrayListDemo arrayListDemo = new ArrayListDemo();
//        arrayListDemo.arrayListMethod();
        arrayListMethod();
    }
}
