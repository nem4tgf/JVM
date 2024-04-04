package session5;

import java.util.Scanner;

public class IntegerArrayDemo {
    Scanner scanner = new Scanner(System.in);

    // Nhap phan tu input element
    public void createArray(int arr[]){
        for (int i = 0;i<arr.length;i++){
            System.out.printf("Nhap phan tu mang tai "+i+": ");
            arr[i] = scanner.nextInt();
        }
    }
    //output array
    public void show(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.printf(arr[i]+"\t");
        }
    }
    //sort ascending
    public void ascSort(int arr[]){
        for (int i = 0; i< arr.length;i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    //sort descending
    public void descSort(int arr[]){

    }
}
