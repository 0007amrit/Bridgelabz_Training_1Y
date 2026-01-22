import java.util.Scanner;
class Spring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  month : ");
        int m=sc.nextInt();
        System.out.println("Enter the date of  month : ");
        int d=sc.nextInt();
        
            if(m==3){
                if(d>=20&&d<=31){
                    System.out.println("Spring Season");
                }
            }
            if(m==4){
                if(d>=1&&d<=30){
                    System.out.println("Spring Season");
                }
            }
            if(m==5){
                if(d>=1&&d<=31){
                    System.out.println("Spring Season");
                }
            }
            if(m==6){
                  if(d>=1&&d<=20){
                    System.out.println("Spring Season");
                }
            }
            else{
                System.out.println("Not a Spring Season");
            }
        }
    }
