public class Vowels {
    public static void main(String[] args){
        char[] arr={'a','b','c','d'};
        int c=0;
        for(char a:arr){
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                c++;
            }
        }
        System.out.println("Count of vowels:"+c);
    }
}
