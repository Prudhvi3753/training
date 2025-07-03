
import java.util.Scanner;
public class gradesArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int b:arr){
            sum+=b;
        }
        System.out.println("total:"+sum);
        int avg=(sum/arr.length)*100;
        if(avg>90){
            System.out.println("A");
        }else if(avg<90 && avg>80){
            System.err.println("B");
        }
        else if(avg<80 && avg>70){
            System.err.println("C");
        }
        
        else if(avg<70 && avg>60){
            System.err.println("D");
        }
        
        else if(avg<60 && avg>50){
            System.err.println("E");
        }else{
            System.err.println("Fail");
        }
    }
}
