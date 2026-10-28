package Recursion.Arrays;

public class PrintArray {
    public static void printInc(int arr[], int index){
        if(index==arr.length){
            return;
        }
        System.out.println(arr[index]);
        printInc(arr,index+1);
    }
    static void main(String[] args) {
        int arr[] = {1,4,2,54,23,48};
        System.out.println(arr);
    }
}
