import java.util.Scanner;
public class Bubble {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int s=sc.nextInt();
        int[] arr=new int[s];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<s;i++){
            for(int j=0;j<s-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        } 
        for(int i=0;i<s;i++){
            System.out.println(arr[i]);
        }
    }
}
