import java.util.*;
public class multable {
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++) {        // rows
            for (int j = 1; j <= 10; j++) {   // columns
                System.out.printf("%-4d", i * j);
            }
            System.out.println(); // next row
    }
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number to print table: ");
        int n = input.nextInt();
        System.out.println("The multiplication table of " + n + " is: ");
        System.out.println("-------------------------------------------------");
        for (int i=1; i<=10; i++){
            System.out.printf("%2d x %2d = %3d%n", n, i, n * i);
        }
    }
    }
}