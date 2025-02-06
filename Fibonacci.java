import java.util.Scanner;
public class fibonaccinumber {
    public static int fibo(int n){
        if(n==1 || n==0) return n; // base case
        return fibo(n-1) + fibo(n-2); // call + work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
