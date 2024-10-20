import java.util.*;
import java.lang.*;
public class Main{
   public static void  pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void floyd(int n){
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(count+" ");
                count+=1;
            }
            System.err.println();
        }
    }
    public static void pattern3(int n){
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //int t= sc.nextInt();
        int n = sc.nextInt();
        //pattern2(n);
        //floyd(n);
        //pattern3(n);
        pattern5(n);
        
    }
}