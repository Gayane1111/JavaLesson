import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

//        takeTheGreatest();
//        compareNumbers();
//        calculateFactorial();
//        findSumAndAverage();
//        System.out.println(greatestCommonDivisor());
//        printRectangle();
//        printEquilateralTriangle();
//        tarsUxxankyunErankyun();
//        printDiamond();
        printDiamondEasy();
//        tarsUxxankyunErankyun();
    }

//    Xndir1 Find Max number

    public static void takeTheGreatest() {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x >= y && x >= z)
            System.out.println(x + " is a max number");
        else {
            if (y > x && y > z)
                System.out.println(y + " is a max number");
            else System.out.println(z + "is a max number");
        }


    }

    //    Xndir2 Compare Numbers
    public static void compareNumbers() {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x == y && x == z)
            System.out.println("All numbers are equal");
        else if (x != y && x != z && y != z)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal or different");
    }

    //Xndir3 GCD

    public static int greatestCommonDivisor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input first number");
        int x = scanner.nextInt();
        System.out.println("Please input second number");
        int y = scanner.nextInt();

        int z = 0;
        for (int i = 1; i <= x; i++) {
            {
                if (x % i == 0 && y % i == 0) {
                    z = i;
                }

            }

        }
        return z;
    }

    // Xndir4  FACTORIAL
    public static void calculateFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number");
        int x = scanner.nextInt();
        int a = 1;
        for (int i = 1; i <= x; i++)
            a *= i;
        System.out.println(a);
    }

    //    Xndir5 Find sum and average
    public static void findSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 5 numbers");
        float x = scanner.nextInt();
        float y = scanner.nextInt();
        float z = scanner.nextInt();
        float h = scanner.nextInt();
        float c = scanner.nextInt();
        float sum = x + y + z + h + c;
        float average = sum / 5;

        System.out.println(sum);
        System.out.println(average);
    }

    //HOMEWORK DAS3

    // Xndir1 Տպել ուղղանկյուն մուտքագրելով կողմերի երկարությունները։
    public static void printRectangle() {
        Scanner inputednumber = new Scanner(System.in);
        System.out.println("please input length  ");
        int length = inputednumber.nextInt();
        System.out.println("Please input width  ");
        int width = inputednumber.nextInt();
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    //Xndir2 Տպել թարս ուղղանկյուն եռանկյուն մուտքագրելով հիմքի երկարությունը։
    public static void tarsUxxankyunErankyun() {
        Scanner inputednumber = new Scanner(System.in);
        System.out.println("Please input the value of the himq");
        int himq = inputednumber.nextInt();
        for (int i = 1; i <= himq; i++) {
            for (int j = himq; j >= i; j--) {
                System.out.print(" *");
            }
            System.out.println("  ");

        }
    }

    // Xndir 3. Տպել հավասարասրուն եռանկյուն մուտքագրելով բարձրությունը

    public static void printEquilateralTriangle() {
        Scanner inputedNumber = new Scanner(System.in);
        System.out.println("Please input the value of the length of diamond");
        int num = inputedNumber.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
//Xndir 4. Print diamond

    public static void printDiamond() {
        Scanner inputedNumber = new Scanner(System.in);
        System.out.println("Please input the value of the length of diamond");
        int num = inputedNumber.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j <= num * 2 - 1; j++) {
                if (i < (num - j)) {
                    System.out.print("  ");
                } else if (j < num + i - 1) {
                    System.out.print(" *");
                }

            }
            System.out.println();
        }
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j <= num * 2 - 1; j++) {
                if (j <= (i - 1)) {
                    System.out.print("  ");
                } else if (i < num * 2 - j - 1) {
                    System.out.print(" *");
                }

            }
            System.out.println();
        }
    }

// Xndir diamond hesht dzev

    public static void printDiamondEasy() {
        Scanner inputedNumber = new Scanner(System.in);
        System.out.println("Please input the value of the length of diamond");
        int num = inputedNumber.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("  ");
            }
            System.out.println();

        }
    }
}





