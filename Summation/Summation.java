import java.util.Scanner;
public class Summation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms you would like to sum: ");
        int numberOfTerms = scanner.nextInt();
        System.out.println();
        int [] terms = new int [numberOfTerms];

        for(int i = 0; i < numberOfTerms; i++)
        {
            System.out.println("Enter the term: ");
            int term = scanner.nextInt();
            terms[i] = term;
        }

        int sum = 0;
        for(int term : terms)
        {
            sum += term;
        }

        System.out.println("The sum of your terms is: " + sum);
    }
}
