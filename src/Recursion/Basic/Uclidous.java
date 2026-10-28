package Recursion.Basic;

public class Uclidous {
    public static int gcd(int x, int y){
        if(y==0){
            return x;
        }
        else {
            int small=gcd(y,x%y);
            return small;//gcd(y, x % y);
        }
    }
    public static  int lcm(int x, int y){
        return (x/gcd(x,y))*y;
    }
    public static void main(String[] args){
        System.out.println(gcd(10,20));
        System.out.println(lcm(12,18));
    }
}
