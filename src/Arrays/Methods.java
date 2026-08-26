package Arrays;

public class Methods {
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int nul(int a, int b){
        return a*b;
    }
    public static void main(String[]args){
        int a = 10;
        int b= 20;
        System.out.println();
        System.out.println("Add of two numbers :- " + a+b);
        System.out.println("Sub of two numbers :- " + (a-b));
        System.out.println("Multiply of two numbers :- "+ a*b);
    }
}
