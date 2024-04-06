package session6;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void demoLinkedList(){
        //khoi ataoLinkedlist
        LinkedList<String> student = new LinkedList<>();
        //them ds
        student.add("Thi");
        student.add("Thi");
        student.add("Thi");
        student.add("Thi");
        student.add("Thi");

        List<String> animal = new LinkedList<>();
        //Ve co ban thi no tuong duong cac phuong thucs trong array lsit
        //add..., get...,set...
        //poll(); : tra ve pt dau tien va xoa khoi ds
        student.poll();
        //pollLast(): tra ve ptu cuoi va xoa khoi ds
        student.pollLast();
        showList(student);
    }
    public static void showList(LinkedList list){
        for (Object linkedList : list){
            System.out.println(linkedList);
        }
    }

    public static void main(String[] args) {
        demoLinkedList();
    }
}
