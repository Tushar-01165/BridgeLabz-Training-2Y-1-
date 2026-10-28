package Recursion.Basic;

public class fibonacciseries {
    public static int fibb(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int small1 = fibb(n - 1);
        int small2 = fibb(n - 2);
        return small1 + small2;
    }

    static void main(String[] args) {
        int n = 5;
        System.out.println(fibb(n) + " ");
    }
}
