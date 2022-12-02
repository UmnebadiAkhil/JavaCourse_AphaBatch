package JavaCourse_AphaBatch;

import java.util.Scanner;

public class TwoDArray {
    public static boolean Search2DArray(int Numbers[][], int key){
        for (int i = 0; i < Numbers.length; i++) {
            for (int j = 0; j < Numbers[0].length; j++) {
                if (Numbers[i][j] == key){
                    System.out.println("Key found at index " + "( "+i+", "+j+" )");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;  
    }
    public static void getLargest(int Numbers[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < Numbers.length; i++) {
            for (int j = 0; j < Numbers[0].length; j++) {
                if (Numbers[i][j] > largest){
                    largest = Numbers[i][j];
                }
                if (Numbers[i][j] < smallest){
                    smallest = Numbers[i][j];
                }
            }
        }
        System.out.println("Largeest number is "+largest);
        System.out.println("Smallest number is "+smallest);
    }
    public static void Spiral(int Num[][]) {
        int startrow=0, endrow = Num.length-1, startcol = 0, endcol = Num[0].length-1;
        while (startcol <= endcol && startrow <= endrow) {
            //Top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(Num[startrow][j]+" ");
            }
            //Right
            for (int i = startrow+1; i <= endrow; i++) {
                System.out.print(Num[i][endcol]+" ");
            }
            //Bottom
            for (int j = endcol-1; j  >= startcol; j--) {
                if (startrow==endrow) {
                    break;
                }
                System.out.print(Num[endrow][j]+" ");
            }
            //Left
            for (int i = endrow-1; i >= startrow+1; i--) {
                if (startcol==endcol) {
                    break;
                }
                System.out.print(Num[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;

        }
    }
    public static int DiagonalSum(int Num[][]) {
        int sum = 0;
        // Time complexity = O(n^2)
        for (int i = 0; i < Num.length; i++) {
            for (int j = 0; j < Num.length; j++) {
                if (i == j) {
                    sum += Num[i][j];
                } else if (i+j == Num.length-1) {
                    sum += Num[i][j];
                }
            }
        }

        // Time complexity = O(n);
        for (int i = 0; i < Num.length; i++) {
            sum += Num[i][i];
            if (i != Num.length - 1 - i) {
                sum += Num[i][Num.length - 1 - i];
            }

        }   
        return sum;
    }
    public static int countKey(int Num[][], int key){
        int count = 0;
        for (int i = 0; i < Num.length; i++) {
            for (int j = 0; j < Num[0].length; j++) {
                if (Num[i][j] == key) {
                    count++;
                }
            }
        }
        return count;
    }
    public static int sum2ndRow(int Num[][]) {
        int sum = 0;
        for (int i = 0; i < Num.length; i++) {
            for (int j = 0; j < Num.length; j++) {
                if (j == 1) {
                    sum+= Num[i][j];
                }
            }
        }
        return sum;
    }
    public static void TransposeMatrix(int Num[][]) {
        int row = Num.length;
        int col = Num[0].length;
        int Transpose[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Transpose[i][j]= Num[j][i];
                System.out.print(Transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String agrs[]){
        int Numbers[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        //Input
        for (int i = 0; i < Numbers.length; i++) {
            for (int j = 0; j < Numbers[0].length; j++) {
                Numbers[i][j] = sc.nextInt();
            }
        }
        int key = 8;
        //Ouput
        for (int i = 0; i < Numbers.length; i++) {
            for (int j = 0; j < Numbers[0].length; j++) {
                System.out.print(Numbers[i][j]+" "); 
            }
            System.out.println();
        }

        Search2DArray(Numbers, key);
        getLargest(Numbers);
        int Num[][] = {{1,5,6,9},
                       {4,8,9,2},
                       {3,5,7,1},
                       {1,5,1,1}};
           Spiral(Num);
        System.out.println( DiagonalSum(Num));
        System.out.println(countKey(Num, 1));

        System.out.println(" Sum is "+ sum2ndRow(Num));
        TransposeMatrix(Num);

    }
}
