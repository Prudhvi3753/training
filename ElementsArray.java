import java.util.Scanner;
public class ElementsArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements:")
;        for(int a:arr){
            System.out.println(a);
        }
    }
}
