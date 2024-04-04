package session5;

import java.util.Scanner;

public class ApplicationDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntegerArrayDemo integerArrayDemo = new IntegerArrayDemo();
        System.out.println("How many elements of array: ");
        int size = sc.nextInt();;
        int intArray[] = new int[size];
        //Pass an array to function
        integerArrayDemo.createArray(intArray);
        //show
        System.out.println("Truoc khi sap xep: ");
        integerArrayDemo.show(intArray);
        System.out.println();

        System.out.println("Length of array: " +intArray.length);
        System.out.println("Value of index 3: " +intArray[3]);

        System.out.println("Sau khi sap xep: ");
        integerArrayDemo.ascSort(intArray);
        integerArrayDemo.show(intArray);

        stringArrayDemo();

    }
    static void stringArrayDemo(){
        String stringArray[] = new String[5];
        stringArray[0]="Thu";
        stringArray[1]="Huy";
        stringArray[2]="Vu";
        stringArray[3]="Hoang";
        stringArray[4]="Thai";

        for (int i = 0; i < stringArray.length; i++){
            System.out.println("String array at: " +stringArray[i]);
        }
    }
}
