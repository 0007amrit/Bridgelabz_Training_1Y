public class ExceptionPropagation {
    public static int divideByZero(){
        int divide=0;
        try{
            divide = 10 / 0;
            return divide;
        } catch (Exception e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
        return divide;
    }
    public static void method2(){
        divideByZero();
    }

   public static void main(String[] args) {
        method2();
    }
}