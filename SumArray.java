
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int b:a){
            sum+=b;
        }
        System.out.println(sum);
    }
}
