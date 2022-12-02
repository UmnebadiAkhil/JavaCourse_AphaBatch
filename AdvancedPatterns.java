package JavaCourse_AphaBatch;

public class AdvancedPatterns {
   
    //Print a Hollow rectangle using loops
    public static void HollowRectangle(){
        int tolRows = 7;
        int tolCols = 5;
        // Outer Loop
        for (int i = 1; i <= tolRows; i++) {
            // Inner loop
            for (int j = 1; j <= tolCols; j++) {
                //Boundray Condition
                if (i == 1 || i == tolRows || j == tolCols || j == 1) {
                    System.out.print("&");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //Print an Inverted rotated half pyrmid
    public static void InvertedRotatedHalfPyrmid(int n){
        //outerloop
        for (int i = 1; i <= n; i++){
            // Inner Loop
            //Spaces
            for (int j = 0; j <= n-i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Print an Inverted Half Pyrmid
    public static void InvertedHalfPyrmid(int n){
        //outer loop
        for (int i = 1; i <= n; i++) {
            //Inner loop
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    //Print a Floyd's Triangle 
    public static void FloydsTriangle(int n){
        int Number = 1;
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(Number+" ");
                Number++;
            }
            System.out.println();
        }
    }
    //Print 
    public static void BinaryTriangle(int n){
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                if ((i+j)% 2 == 0){
                System.out.print("1");
                }else{
                    System.out.print("0");
                }
                
            }
            System.out.println();
        }
    }
    //Print a Butterfly Pattern
    public static void ButterflyPattern(int n){
        //1st Half
        //outer loop
        for (int i = 1; i <= n; i++) {
            //Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd Half 
         //outer loop
         for (int i = n; i >= 1; i--) {
            //Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Print a solid rhombus
    public static void SolidRhombus(int n) {
        //outer loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Print a Hollow Rhombus
    public static void HollowRhombus(int n) {
        //Outer Loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n||j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void DiamandPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String agrs[]){
        //HollowRectangle();
        //InvertedRotatedHalfPyrmid(8);
        //InvertedHalfPyrmid(5);
        //FloydsTriangle(5);
        //BinaryTriangle(5);
        //ButterflyPattern(15);
        //SolidRhombus(5);
        //HollowRhombus(5);
        DiamandPattern(5);
     }
}
