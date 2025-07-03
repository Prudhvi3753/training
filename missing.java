import java.util.Scanner;
public class missing {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array:");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        System.out.println("Enter the values in an array:");
        int[] arr=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<s;i++){
            if(arr[i]==j){
                j++;
            }
            
        }
        System.out.println(j);
    }
}
