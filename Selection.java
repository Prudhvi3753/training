import java.util.Scanner;
public class Selection {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int s=sc.nextInt();
        int[] arr=new int[s];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<s;i++){
            for(int j=i+1;j<s;j++){
                int min=arr[i];
                if(arr[j]<arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int i=0;i<s;i++){
            System.out.println(arr[i]);
        }
    }
}
