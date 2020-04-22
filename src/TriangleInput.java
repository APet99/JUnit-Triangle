import java.util.Scanner;
public class TriangleInput {

    public static void main(String args[]) {

        System.out.println("Please enter 3 number lengths for each side of the" +
                " triangle. Press enter after each number.");

        Scanner sideA = new Scanner(System.in);
        String sA = sideA.nextLine();
        System.out.println("Side A: " + (sA));

        Scanner sideB = new Scanner(System.in);
        String sB = sideB.nextLine();
        System.out.println("Side B: " + (sB));

        Scanner sideC = new Scanner(System.in);
        String sC = sideC.nextLine();
        System.out.println("Side C: " + (sC));

        double s1 = Double.valueOf(sA);
        double s2 = Double.valueOf(sB);
        double s3 = Double.valueOf(sC);

        Triangle triangle = new Triangle(s1, s2, s3);
        if(triangle.notATriangle()){
            // not a triangle. Do something about that here.
            System.out.println("Error, not a valid triangle!");
        } else if(triangle.isEquilateral()){
            // is equilateral and isosceles
            System.out.println("The triangle is EQUILATERAL!");
        } else if(triangle.isScalene()){
            // is a scalene
            System.out.println("The triangle is SCALENE!");
        }else{
            //is isosceles only
            System.out.println("The triangle is ISOSCELES!");
        }
    }
}