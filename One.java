class One{
    public static void main(String[] args){
        int i=0;
        while(i<=10){
            if(i==3||i==7||i==9){
                i++;
                continue;
            }
            System.out.println(i);
            i++;

        }
    }
}