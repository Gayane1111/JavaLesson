import java.util.Scanner;

public class Learning {
    public static void main(String[] args) {
//        fibonachi();
   hamematelMinchevZron();
    }

    //Fibonachi
    public static void fibonachi() {
        Scanner inputedNumber = new Scanner(System.in);
        int num = inputedNumber.nextInt();

        int first = 0;
        int second = 1;
        int nextElement;
        while (first < num) {

            System.out.println(first);
            nextElement = first + second;
            first = second;
            second = nextElement;


        }
    }

    //tpel minchev 0 mutqagracneri max ev min
    public static void hamematelMinchevZron() {
        Scanner inputedNumber = new Scanner(System.in);
        int i = inputedNumber.nextInt();


        while (i == 0) {
             i = inputedNumber.nextInt();
            System.out.println("Please input number grater than 0");

            if(num > a){ a = num;
                System.out.println(a + " is greater that "+ num);
            }
            else {
                System.out.println(num + " is greater that "+ a);

        }

    }
    }
}

















