/**
 * Created By:
 *          @author Alex Peterson       AlexJoseph.Peterson@CalBaptist.edu
 * Last Edited:
 *          April 14, 2020
 * Created For:
 *          Dr. Kolta- EGR323 Software Req. Analysis and Testing
 *
 * Unit tests for Triangle.java functionality.
 * */

import jdk.swing.interop.SwingInterOpUtils;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    /**
     * All possible triangle combinations are as follows:
     *
     *
     *   allZeroTest
     *
     *  allDifferentScaleneTest
     *  oneSameTwoScaleneTest
     *  oneSameThreeScaleneTest
     *  twoSameThreeScaleneTest
     *
     *  allDifferentIsoscelesTest
     *  oneSameTwoIsoscelesTest
     *  oneSameThreeIsoscelesTest
     *  twoSameThreeIsoscelesTest
     *
     *  allDifferentEquilateralTest
     *  oneSameTwoEquilateralTest
     *  oneSameThreeEquilateralTest
     *  twoSameThreeEquilateralTest
     *
     *  All 3 sides 0
     *  All 3 sides different
     *  sides 1 == 2, 3
     *  sides 1 == 3, 2
     *  sides 2 == 3, 1
     *  All 3 sides same
     *
     *  Scalene:        No equal sides.
     *  Isosceles:      Two equal sides.
     *  Equilateral:    Three matching sides.
     * */
    Triangle triangle;

    // Creates triangle where sides 1 and sides 2 are equal.
    private void makeOneSameTwo(){
        triangle = new Triangle(2.5,2.5,3.5);
    }

    // Creates triangle where sides 1 and sides 3 are equal.
    private void makeOneSameThree(){
        triangle = new Triangle(2.5,3.5,2.5);
    }

    // Creates triangle where sides 2 and sides 3 are equal.
    private void makeTwoSameThree(){
        triangle = new Triangle(3.5,2.5,2.5);
    }

    // Creates triangle where no sides are equal.
    private void makeAllDifferent(){
        triangle = new Triangle(1.5, 3.7, 4.7);
    }

    /**
     *  Tests triangle when all sides are different.
     *
     *  When all sides are different, a triangle is scalene.
     *  A scalene triangle can not also be Isosceles or equilateral.
     * */
    @Test
    public void allDifferentScaleneTest(){
        makeAllDifferent();

        Assert.assertTrue("No equal sides in a scalene.", triangle.isScalene());
        Assert.assertFalse("A scalene can not also be equilateral,", triangle.isEquilateral());
    }



    //Scalene Tests:
    /**
     *  Tests scalene triangle when sides 1 and sides 2 are equal.
     *
     *  A scalene must have NO equal sides.
     *  A scalene triangle can not also be Isosceles or equilateral.
     * */
    @Test
    public void oneSameTwoScaleneTest(){
        makeOneSameTwo();

        Assert.assertFalse("No equal sides in a scalene.", triangle.isScalene());
        Assert.assertFalse("A scalene can not also be equilateral,", triangle.isEquilateral());
    }

    /**
     *  Tests scalene triangle when sides 1 and sides 3 are equal.
     *
     *  A scalene must have NO equal sides.
     *  A scalene triangle can not also be Isosceles or equilateral.
     * */
    @Test
    public void oneSameThreeScaleneTest(){
        makeOneSameThree();

        Assert.assertFalse("No equal sides in a scalene.", triangle.isScalene());
        Assert.assertFalse("A scalene can not also be equilateral,", triangle.isEquilateral());
    }

    /**
     *  Tests scalene triangle when sides 2 and sides 3 are equal.
     *
     *  A scalene must have NO equal sides.
     *  A scalene triangle can not also be Isosceles or equilateral.
     * */
    @Test
    public void twoSameThreeScaleneTest(){
        makeTwoSameThree();

        Assert.assertFalse("No equal sides in a scalene.", triangle.isScalene());
        Assert.assertFalse("A scalene can not also be equilateral,", triangle.isEquilateral());
    }




    //Isosceles Tests:
    /**
     *  Tests isosceles triangle when sides 1 and sides 2 are equal.
     *
     *  An isosceles has 2 equal sides.
     *  An isosceles triangle can not also be Isosceles or equilateral.
     * */
    @Test
    public void oneSameTwoIsoscelesTest(){
        makeOneSameTwo();

        Assert.assertFalse("An isosceles can not also be scalene,", triangle.isScalene());
        Assert.assertFalse("An isosceles can not also be equilateral,", triangle.isEquilateral());
    }

    /**
     *  Tests isosceles triangle when sides 1 and sides 3 are equal.
     *
     *  An isosceles has 2 equal sides.
     *  An isosceles triangle can not also be Isosceles or equilateral.
     * */
    @Test
    public void oneSameThreeIsoscelesTest(){
        makeOneSameThree();

        Assert.assertFalse("An isosceles can not also be scalene,", triangle.isScalene());
        Assert.assertFalse("An isosceles can not also be equilateral,", triangle.isEquilateral());
    }

    /**
     *  Tests isosceles triangle when sides 2 and sides 3 are equal.
     *
     *  An isosceles has 2 equal sides.
     *  An isosceles triangle can not also be Isosceles or equilateral.
     * */
    @Test
    public void twoSameThreeIsoscelesTest(){
        makeTwoSameThree();

        Assert.assertFalse("An isosceles can not also be scalene,", triangle.isScalene());
        Assert.assertFalse("An isosceles can not also be equilateral,", triangle.isEquilateral());
    }




    //Equilateral Tests:
    /**
     *  Tests equilateral triangle when sides 1 and sides 2 are equal.
     *
     *  An equilateral has 3 equal sides.
     *  An isosceles triangle is also isosceles but not scalene.
     * */
    @Test
    public void oneSameTwoEquilateralTest(){
        makeOneSameTwo();

        Assert.assertFalse("An equilateral must have all sides equal", triangle.isEquilateral());
        Assert.assertFalse("an equilateral can not be scalene.", triangle.isScalene());
    }

    /**
     *  Tests equilateral triangle when sides 1 and sides 3 equal.
     *
     *  An equilateral has 3 equal sides.
     *  An isosceles triangle is also isosceles but not scalene.
     * */
    @Test
    public void oneSameThreeEquilateralTest(){
        makeOneSameThree();
        System.out.println(triangle.isScalene());
        Assert.assertFalse("An equilateral must have all sides equal", triangle.isEquilateral());
        Assert.assertFalse("an equilateral can not be scalene.", triangle.isScalene());
    }

    /**
     *  Tests equilateral triangle when sides 2 and sides 3 are equal.
     *
     *  An equilateral has 3 equal sides.
     *  An isosceles triangle is also isosceles but not scalene.
     * */
    @Test
    public void twoSameThreeEquilateralTest(){
        makeTwoSameThree();

        Assert.assertFalse("An equilateral must have all sides equal", triangle.isEquilateral());
        Assert.assertFalse("an equilateral can not be scalene.", triangle.isScalene());
    }

    /**
     *  Tests equilateral triangle when all sides are equal.
     *
     *  An equilateral has 3 equal sides.
     *  An isosceles triangle is also isosceles but not scalene.
     * */
    @Test
    public void equilateralTest(){
        triangle = new Triangle(1,1,1);

        Assert.assertTrue("The triangle should be an equilateral." ,triangle.isEquilateral());
        Assert.assertFalse("an equilateral can not be scalene.", triangle.isScalene());
    }

    @Test
    public void isNotTriangleTest(){
        triangle = new Triangle(1.5,1.5, 3.1);

        Assert.assertTrue(triangle.notATriangle());
    }

    @Test
    public void equilateralIsTriangleTest(){
        triangle = new Triangle(2.0,2.0,2.0);

        Assert.assertFalse(triangle.notATriangle());
    }

    @Test
    public void scaleneIsTriangleTest(){
        makeAllDifferent();

        Assert.assertFalse(triangle.notATriangle());
    }

    @Test
    public void isoscelesIsTriangleTest(){
        makeTwoSameThree();

        Assert.assertFalse(triangle.notATriangle());
    }
}