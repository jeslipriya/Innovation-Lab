import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number 1");
        int a = scan.nextInt();

        System.out.println("Enter Number 2");
        int b = scan.nextInt();

        System.out.println("Before Swapping");
        System.out.println("A= " + a + "\nB= " + b);
        
        a = a + b; 
        b = a - b; 
        a = a - b; 


        System.out.println("After Swapping");
        System.out.println("A = " + a + "\nB= " + b);

        scan.close();
   }
}
