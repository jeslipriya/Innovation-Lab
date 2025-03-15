import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number to display Multiplication Table: ");
        int num = scan.nextInt();

        System.out.println("\t\tThe Numtiplication Table of " + num);
        scan.nextLine();
        for(int i=1; i<=10; i++){
            System.out.println(i + " X " + num + " = " + i*num);
        }

        scan.close();
    }
}
