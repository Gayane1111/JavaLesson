import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        float x = in.nextFloat();
//        char z = in.next().charAt(0);
//        float y = in.nextFloat();
//
//
//        switch (z) {
//            case '+':
//                System.out.println(x + y);
//                break;
//            case '-':
//                System.out.println(x - y);
//                break;
//            case '*':
//                System.out.println(x * y);
//                break;
//            case '/':
//                if (y == 0) {
//                    System.out.println("error");
//                } else {
//                    System.out.println(x / y);
//                }
//            default:
//                System.out.println("Should be used only +; -; *; / symbols");

        //System.out.println(myMethod(2.95));
        int myNum1  = myMethod(10);
        double myNum2 = myMethod(5.36);
        System.out.println(myMethod(myNum1 + myNum2));

    }


    static int myMethod(int x){
        return x;
    }
    static double myMethod(double y){
        return y;
    }
}







