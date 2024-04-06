package session6;

import java.util.ArrayList;

public class ApplicationExample {
    public static void main(String[] args) {
        Student student = new Student(1,"Ngoc",20);
        ArrayList<Student> listStudent = new ArrayList<>();
        //Them sv vao list
        listStudent.add(student);
        listStudent.add(new Student(2,"Ving",21));
        listStudent.add(new Student(3,"Vi",24));
        listStudent.add(new Student(4,"Thuy",23));
        listStudent.add(new Student(5,"Trang",22));
        listStudent.add(new Student(6,"Linh",40));
        for (Student stu : listStudent){
            System.out.println(stu);
        }
        for (int i = 0;i < listStudent.size(); i++){
            if (listStudent.get(i).name.contains("Trang")){
                System.out.println(listStudent.get(i));
                listStudent.remove(listStudent.get(i));
            }
        }
        System.out.println("Ds sau khi tim dc va xoa");
        for (Student stu2 : listStudent){
            System.out.println(stu2);
        }
    }
}
