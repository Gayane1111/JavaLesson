import java.security.KeyStore;


public class Main {
    public static void main(String[] args) {
    }


        /*System.out.println("print numbers from 1 to 15");

        int[] array = {2, 5, -7, 6, 0, 3, 6};

        for (int i = 0; i < 16; i++) {
            System.out.print(i + " ");

        }
        System.out.println("\n\nPrint even numbers from -10 to 20");
        for (int i = -10; i < 21; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nPrint * symbols using given number");
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n\nPrint * symbols using given number in reverse mode");

        for (int i = 4; i <= n; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            if (i == 0)
                break;

            System.out.println();

        }
        System.out.println("\n\nCreate an array with number 1-11");

        int[] Array = new int[11];
        for (int i = 0; i < Array.length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(Array[i]);

            }

        }
        int[] myNum = {15, 2, 7, 9, 1, 15, 36, 48, 3, 79, 8}; //print odd elements in one line

        for (int i : myNum) {
            if (i % 2 == 1)
                System.out.print(i + " ");

        }
        System.out.println("\n\n 8 . Given an array. print elements from -10 to 5");
        int[] array1 = {15, 2, 7, 9, 1, 15, 36, 48, 3, 79, 8};
        for (int i : array1) {
            if (i >= -10 && i <= 5)
                System.out.print(i + " ");

        }
        System.out.println("\n\n 9 . Given an array. print elements which can be divided 3");
        int[] array2 = {15, 2, 7, 9, 1, 16, 36, 48, 3, 79, 8};
        for (int i : array2) {
            if (i % 3 == 0 || i % 4 == 0)
                System.out.print(i + " ");
        }
        System.out.println("\n\n 10. Given an array. print count of even elements");
        int[] array3 = {15, 2, 7, 9, 87, 4, 56, 0, 1, 16, 36, 48, 3, 79, 8};
        int counter = 0;
        for (int i : array3) {
            if (i % 2 == 0)
                counter++;

        }
        System.out.println(counter);

        System.out.println("\n\n 11. Given an array. print sum of elements");
        int[] array4 = {15, 2, 7, 9, 87, 4, 56, 0, 1, 16, 36, 48, 3, 79, 8};
        int sum = array4[0];
        for (int i = 1; i < array4.length; i++) {
            sum = sum + array4[i];
        }
        System.out.println(sum);

        System.out.println("\n\n 12. Given an array. print sum of positive elements");
        int[] array5 = {15, -2, 7, 9, -87, 4, -56, 0, 1, 16, -36, -48, 3, -79, 8};
        int posSum = 0;
        for (int i = 1; i < array5.length; i++) {
            if (array5[i] >= 0)
                posSum += array5[i];
        }
        System.out.println(posSum);

        System.out.println("\n\n 13. Given an array. print multiplication  of positive elements");
        int[] array6 = {5, -2, 3, 1, -8, 4};
        int mult = 1;
        for (int i = 0; i < array6.length; i++) {
            if (array6[i] > 0)
                mult *= array6[i];
        }
        System.out.println(mult);

        System.out.println("\n\n 14. Given an array. Find max elements in the array");

        int[] array7 = {15, 2, 7, 9, 87, 4, 56, 0, 1, 16, 36, 48, 3, 79, 8};

        int max = array7[0];
        for (int i = 1; i < array7.length; i++) {
            if (array7[i] > max)
                max = array7[i];
        }

        System.out.println(max);

        System.out.println("\n\n 15. Given an array. Find elements which is alone");
        array = new int[]{4, 2, 1, 9, 2, 1, 4};
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result = result ^ array[i];
        }
        System.out.println(result);


        System.out.println("\n\n 16. Sort an array in asc");
        array = new int[]{15, 2, 7, -45, 0, 79, 455, 4};

        //bubble sort

//        for (int a : array) {
//            System.out.print(a + " ");
//        }
        boolean qaniDerIfyMtnuma = true;

        int countOfFors = 0;
        while (qaniDerIfyMtnuma) {
            qaniDerIfyMtnuma = false;
            for (int i = 0; i < array.length - 1 - countOfFors; i++) {
                if (array[i] > array[i + 1]) {
                    int z = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = z;
                    qaniDerIfyMtnuma = true;
                }
            }
            countOfFors++;
        }
        System.out.println();
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.print(countOfFors);


        System.out.println("\n\n 16. print numbers from 1 to 10");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);

        }

        System.out.println("\n\n 17. print sum of numbers from 1 to 10");
        int sumN = 0;
        for (int i = 0; i <= 10; i++) {
            sumN += i;
        }
        System.out.println(sumN);


        System.out.println("\n\n 18. print factorial of 10");
        int factorial10 = 1;
        for (int i = 1; i <= 10; i++) {
            factorial10 *= i;
        }
        System.out.println(factorial10);


        System.out.println("\n\n 19. writhe method for the printing the sum of the numbers from given range");
        numSum(10, 55);

        System.out.println("\n\n 20. writhe method for the printing the factorial of the numbers from given range");
        factorialX(0);


    }

// 19. writhe method for the printing the sum of the numbers from given range.

    static void numSum(int x, int y) {
        int sumN = 0;
        for (int i = x; i <= y; i++) {
            sumN += i;
        }
        System.out.println(sumN);
    }

//20. writhe method for the printing the factorial of the numbers from given range.

        static void factorialX ( int a){
            int multiplier = 1;
            for (int i = 1; i < a; i++) {
                multiplier *= i;
            }
            System.out.println(multiplier);


        } */

        /*Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        sumX(b);
        factorialX(a);
//        sadas(2);*/

        //int x;
        // Use Scanner class to get user input for calculation.
        // Scanner in = new Scanner(System.in);
        //read the user input and assign to the num variable
        //nt a = in.nextInt();
        //call the method we made and pass the num into it
        //factorialX(a);.
    }

   /* static void factorialX(int a) {
        int multiplier = 1;
        for (int i = 1; i <= a; i++) {
            multiplier *= i;
        }
        System.out.println(multiplier);*/


   /* static void sumX(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println(sum);
    }*/

//    static void sadas(int k) {
//        switch (k) {
//            case 1:
//                System.out.println(1);
//            case 2:
//                System.out.println(2);
//            default:
//                System.out.println("Not 1 and 2");
//        }
//    }

















