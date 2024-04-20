package session7;


import java.util.Iterator;
import java.util.LinkedHashSet;

//Duy tri thứ tự chèn, chứa các phần tử k trùng nhau.
//Cho phép pt Null
public class LinkedHashSetExample {
    public static void linkedHashSetDemo(){
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        //adding element
        linkedHashSet.add("Java ");
        linkedHashSet.add("C# ");
        linkedHashSet.add("HTML ");
        linkedHashSet.add("Python ");
        linkedHashSet.add("ASP.NET ");
        linkedHashSet.add("ASP.NET ");

        //check exists
        System.out.println("Check exists: "+linkedHashSet.contains("C#"));


        System.out.println("LinkedHashSet: "+linkedHashSet);

        //Iterator: Dùng để lặp thông qua 1 linkedHashSet
        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next() + " ");
            System.out.println();

            //Use foreach
        for (String str : linkedHashSet)
            System.out.println(str + ", ");
            System.out.println();
    }

    public static void main(String[] args) {
        linkedHashSetDemo();
    }
}
