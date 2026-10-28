package Recursion.Strings;

public class NameSearch {
    public static void print(String S1, int index){
        if(index==S1.length()){
            return;
        }
        System.out.print(S1.charAt(index)+" ");
        print(S1,index+1);
        System.out.print(S1.charAt(index)+" ");
    }

    static void main(String[] args) {
        String S1 = "HELLO";
        print(S1, 0);
    }
}