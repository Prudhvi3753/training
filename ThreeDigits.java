import java.util.Scanner;
public class ThreeDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int a:arr){
            
            while(a!=0){
                int b=a%10;
                c++;
            }
            if(c==3){
                System.out.print(a);
            }
        }
    }
}