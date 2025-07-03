
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        System.out.println("Enter the size of an array:");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        System.out.println("Enter a target value:");
        int target=sc.nextInt();
        System.out.println("Enter the values in an array:");
        int[] arr=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<s;i++){
            System.out.println(arr[i]);
        }
        for(int i=0;i<s;i++){
            if(arr[i]==target){
                System.out.println("true");
            }
        }

    }
}