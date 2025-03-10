import java.util.Scanner;


public class GreaterNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int firstNum = scanner.nextInt();

        System.err.println("Enter the second number:");
        int secondNum = scanner.nextInt();

        System.out.println("Enter the third number:");
        int thirdNum = scanner.nextInt();

        if (firstNum > secondNum && firstNum > thirdNum) {
            System.out.println(firstNum + " is the greatest.");
        } 
        else if (secondNum > firstNum && secondNum > thirdNum) {
            System.out.println(secondNum + " is the greatest.");
        } 
        else {
            System.out.println(thirdNum + " is the greatest.");
        }
        scanner.close();
    }
}
