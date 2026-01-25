class Palindrome{
    public static void main(String arg[]){
        int num=1221;
        int temp=num;
        int rev=0;
        int rem=0;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(num==rev){
            System.out.println("This is a Palindrome ");
        }
        else{
            System.out.println("This is not a Palindrome ");
        }
            
        
    }
}