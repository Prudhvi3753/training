import java.util.Scanner;
public class CountNegPos {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Count:");
        int n=0,p=0,z=0;
;        for(int a:arr){
            if(a<0){
                n++;
            }else if(a>0){
                p++;
            }else{
                z++;
            }
        }
        System.out.println("Negative:"+n+" positive:"+p+" Zeros:"+z);
    }
}
