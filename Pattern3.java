public class Pattern3{
    public static void main(String[] args){
        int a=0,b=1,count = 5,sum = 0;
        for (int i=0;i<count;i++){
            sum=a+b;
            a=b;
            b=sum;
            System.out.println(sum);
        }
    }
}