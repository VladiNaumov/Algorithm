package Task5;

/*
    1. Написать программу по возведению числа в степень с помощью рекурсии.
    2. Написать программу «Задача о рюкзаке» с помощью рекурсии.

 */

public class RunAppTask1 {

    public static void main(String[] args) {
        System.out.println(exponentiationRecursionMethod(2.2, -2));
        System.out.println(exponentiationRecursionMethod(3.1, 4));
        System.out.println(exponentiationRecursionMethod(9, 0));
        System.out.println(exponentiationRecursionMethod(7, -3));
        System.out.println(exponentiationRecursionMethod(3, 1));
        System.out.println(exponentiationRecursionMethod(0, 10));
      //  System.out.println(exponentiation(0, -1));//error
    }

    private static double exponentiationRecursionMethod(double digit, int rank) {
        if (digit == 0) {
            if (rank > 0)
                return 0;
            else
                throw new IllegalArgumentException("Invalid rank " + rank + " for digit = 0");
        }
        if (rank < 0) {
            return 1 / (digit * exponentiationRecursionMethod(digit, -rank - 1));
        }
        else if (rank > 0) {
            return digit * exponentiationRecursionMethod(digit, rank - 1);
        }
        else {
            return 1;
        }
    }
}
