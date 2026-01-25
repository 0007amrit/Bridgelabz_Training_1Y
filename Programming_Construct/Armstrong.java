import java.util.Scanner;
class Armstrong
{
    public static void main(String arg[]){
        Scanner a =new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=a.nextInt();
        int res=0;
        int og_num=num;
        while(num!=0){
            int digit=num%10;
            res+=digit*digit*digit;
            num/=10;
        }
        if(res ==og_num){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
}