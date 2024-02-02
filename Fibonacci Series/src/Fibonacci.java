
import java.util.Scanner;

class Fibonacci{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, ans = 1, prev = 1, next = 1;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        System.out.print("Fibonacci: " + ans + ", ");
        for(int i = 1; i < num; i++)
        {
            prev = next;
            next = ans;
            System.out.print(ans + ", ");
            ans = next + prev;
        }
    }
}