import java.util.Scanner;
import static java.lang.Math.min;

public class exam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int negativeOddCounter = 0;
        int negativeEvenCounter = 0;
        int num = 0;
        int sum = 0;
        int positiveOddCounter = 0;
        int positiveEvenCounter = 0;
        int minNeg = 0;
        int neg = 0;
        int n = 0;

        System.out.println("Enter positive or negative numbers, 0 to exit. To start press any number and click enter.");
        int choice = sc.nextInt();
        while(choice != 0) {
            System.out.println("Enter positive or negative numbers, 0 to exit.");
            num = sc.nextInt();
            if(num % 2 == 0 & num > 0) {
                positiveEvenCounter++;
            } else if (num % 2 != 0 & num > 0) {
                positiveOddCounter++;
            }   else if (num % 2 == 0 & num < 0) {
                negativeEvenCounter++;
            } else if (num % 2 != 0  & num < 0) {
                negativeOddCounter++;
            } else if (num == 0) {
                break;
            } 
            if (num < 0)  {
                if (num < minNeg) {
                    minNeg = num;
                }
            }
        }

        System.out.println("There have been entered " + negativeOddCounter  + " negative odd numbers.");
        System.out.println("There have been entered " + negativeEvenCounter  + " negative even numbers.");
        System.out.println("There have been entered " + positiveOddCounter  + " positive odd numbers.");
        System.out.println("There have been entered " + positiveEvenCounter  + " positive even numbers.");

        System.out.println("The minimum of the negative numbers is " + minNeg);

        System.out.println("Enter positive integer number: ");

        int posNum = sc.nextInt();
        while (posNum < 0) {
            System.out.println("Please enter positive integer number.");
            posNum = sc.nextInt();
            continue;
            
        }
        for (int i = 0; i <= posNum; i ++) {
            if(i % 2 != 0 && i > 0) {
                sum += i;
            } 
        }
        System.out.println("Sum of all odd numbers between 0 to " + posNum + " = " + sum);
    }

}