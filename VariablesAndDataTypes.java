import java.util.*;

public class VariablesAndDataTypes {
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println("Average of 3 input numbers : "+ CalculateAverage(A, B, C));
        int side = sc.nextInt();
        System.out.println("Area of a square is : " + CalculateSpuare(side));
        System.out.println( "Your bill is : " + GetBill(4,5,7));
    }
    //In a program,input 3 numbers:A,B and C.You have to out put the average of these 3 numbers.
    public static int CalculateAverage(int A, int B, int C){
        int avg = (A+B+C)/3;
        return avg;

    }
    //In a program,input the side of a square. You have to output the area of the Square.
    public static double CalculateSpuare(int side){
        double Square = side * side;
        return Square;
    }
    //Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
    //(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem.)
    public static float GetBill(float pencil, float pen , float eraser){
        float BillAmount = (pen+pencil+eraser)+((pen+pencil+eraser)*(0.18f));
        return BillAmount;
    }
}