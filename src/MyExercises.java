import java.util.Scanner;

public class MyExercises {
    public static void main(String[] args) {
//        positiveOrNegative();
//        System.out.println(greatestCommonDivisor());
//        getFloatNUmber();
//        printWeekdays();
//          printNumber1or2();

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i >= (10 -j)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //1. Write a Java program to get a number from the user and print whether it is positive or negative.

    public static void positiveOrNegative(){
        Scanner inputedNumber = new Scanner(System.in);
        int number = inputedNumber.nextInt();
        if (number > 0){
            System.out.println("Inputed number is positive");}
        else if (number == 0){
            System.out.println("Inputed number is 0");}
        else {System.out.println("inputed number is negative");}

    }

    /*2. Input float number and
     prints "zero" if the number is zero. Otherwise, print "positive" or "negative".
     Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.*/

    public static void getFloatNUmber() {
        for (; ; ) {
            System.out.println("Please input floating point number");
            Scanner inputedNumber = new Scanner(System.in);
            float number = inputedNumber.nextFloat();
            if (number == 0) {
                System.out.println("Zero");
            } else {
                if (number > 0) {
                    System.out.println("Positive");
                } else {
                    System.out.println("Negative");
                }
                if (Math.abs(number) < 1) {
                    System.out.println("small");
                }
                if (Math.abs(number) > 1000000) {
                    System.out.println("large");
                }
            }
        }
    }

    //Xndir 3 Takes a number from the user and generates an integer between 1 and 7. It displays the weekday name

    public static void printWeekdays() {
        System.out.println("Please input number from 1 to 7");
        Scanner inputedNuimber = new Scanner(System.in);
        int number = inputedNuimber.nextInt();
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not valid number");
        }
    }

    // Write method which is take 2 then print 1 and takes 1 then print 2
    public static void printNumber1or2(){
        System.out.println("please input 1 or 2");
        Scanner inputedNumber = new Scanner(System.in);
        int num = inputedNumber.nextInt();
        int answer = 3-num;
        System.out.println(answer);
    }

    //Xndir GCD

    public static int greatestCommonDivisor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input first number");
        int x = scanner.nextInt();
        System.out.println("Please input second number");
        int y = scanner.nextInt();
        int z = 0;
        if (x == 0) {
            return y;
        } else if (y == 0) {
            return x;
        } else {

            for (int i = 1; i <= x; i++) {
                {
                    if (x % i == 0 && y % i == 0) {
                        z = i;
                    }

                }

            }
            return z;
        }
    }
    //Xndir GCD

    public static int greatestCommonDivisor2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input first number");
        int x = scanner.nextInt();
        System.out.println("Please input second number");
        int y = scanner.nextInt();
        int z = 0;
        if (x == 0) {
            return y;
        } else if (y == 0) {
            return x;
        } else if (x < y && y % x == 0) {
            return x;
        } else if (x > y && x % y == 0) {
            return y;
        } else {
            for (int i = 1; i <= x; i++) {
                {
                    if (x % i == 0 && y % i == 0) {
                        z = i;
                    }

                }

            }
            return z;
        }
    }

    public static void findSumAndAverage2() {

        float sum = 0;
        float average = 0;

        System.out.println("Please input numbers count.");

        Scanner inputCount = new Scanner(System.in);
        int numbersCount = inputCount.nextInt();
        if (numbersCount > 0) {
            System.out.println("Please input numbers.");
            for (int i = 0; i < numbersCount; i++) {

                Scanner input = new Scanner(System.in);
                int number = input.nextInt();
                sum += number;

            }
            average = sum / numbersCount;

            System.out.println(sum);
            System.out.println(average);
        } else System.out.println("Wrong statement");


    }

}
