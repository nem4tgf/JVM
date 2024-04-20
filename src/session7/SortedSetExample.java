package session7;

import java.util.SortedSet;
import java.util.TreeSet;
//SortedSet: Sắp xếp tăng dần k trùng nhau
public class SortedSetExample {
    public static void sortedSetDemo(){
        //Khai bao SortedSet
        SortedSet<String> st = new TreeSet<String>();
        //add() method to add elements
        st.add("Vinh");
        st.add("Văn");
        st.add("Ngọc");
        st.add("Hải");
        st.add("Anh");
        st.add("Hoàng");
        System.out.println("Initial TreeSet" +st);

        //remove the element
        st.remove("Hải");
        st.add("Vinh");
        System.out.println("After remove and add: ");
    }

    public static void main(String[] args) {
        sortedSetDemo();
    }
}
