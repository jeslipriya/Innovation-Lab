import java.util.Scanner;

class RectangleArea{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.err.print("Enter the Length of the rectangle: ");
        int len = scan.nextInt();

        System.out.print("Enter the Breath of the rectangle: ");
        int bh = scan.nextInt();

        if (len>0 && bh>0) {
            
            int area = len*bh;
            System.out.println("The area of the Rectangle is: " + area);
        }

        else{
            System.out.println("Enter the Positive number. Try Again!");
        }

        scan.close();
    }
}