import com.average.of.three.AverageOfThree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int firstNumber, secondNumber, thirdNumber = 0;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter first number: ");
            firstNumber = sc.nextInt();
            if(firstNumber > AverageOfThree.maxInput) {
                System.out.println("Invalid input. Please enter numbers from 1 to " + AverageOfThree.maxInput);
            } else {
                break;
            }
        }

        System.out.println("Enter second number: ");
        secondNumber = sc.nextInt();
        System.out.println("Enter third number: ");
        thirdNumber = sc.nextInt();
        //instance is defined as a copy of an object
        AverageOfThree ave3 = new AverageOfThree(firstNumber, secondNumber, thirdNumber);

        while(true) {
            System.out.println("Enter first number: ");
            firstNumber = sc.nextInt();
            if(firstNumber > AverageOfThree.maxInput) {
                System.out.println("Invalid input. Please enter numbers from 1 to " + AverageOfThree.maxInput);
            } else {
                break;
            }
        }
        System.out.println("Enter second number: ");
        secondNumber = sc.nextInt();
        System.out.println("Enter third number: ");
        thirdNumber = sc.nextInt();
        //instance is defined as a copy of an object
        AverageOfThree ave3_2 = new AverageOfThree(firstNumber, secondNumber, thirdNumber);

        printResult(ave3.getAverageOfThree(), ave3_2.getAverageOfThree());

    }

    public static void printResult(double result1, double result2){
        System.out.println("The average of first three numbers is " + result1);
        System.out.println("The average of last three numbers is " + result2);
    }

}
