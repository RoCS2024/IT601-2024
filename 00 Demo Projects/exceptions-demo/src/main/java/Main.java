import com.exceptions.demo.Division;
import com.exceptions.demo.exceptions.IllegalDivisorException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Division division = new Division();
        System.out.println("Enter dividend: ");
        division.setDividend(sc.nextDouble());
        System.out.println("Enter divisor: ");
        try {
            division.setDivisor(sc.nextDouble());
            //codes
        } catch (IllegalDivisorException e) {
            System.out.println(e.getMessage());
        }
    }
}
