import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        String [] b={"Even","Odd"};
        for(int a:arr){
            /*if(a%2==0){
                System.out.println("Even number:"+a);
            }else{
                System.out.println("odd number:"+a );
            }*/
            System.out.println(a+"is"+b[a%2]);
        }
    }
}