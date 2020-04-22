public class Triangle {
    private double sideA, sideB, sideC;

    Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    public boolean notATriangle(){
        return (sideA + sideB <= sideC) || (sideA + sideC <= sideB) || (sideB + sideC <= sideA);
    }

    public boolean isEquilateral(){
        return (this.sideA == sideB) && (this.sideB == this.sideC);
    }

    public boolean isScalene(){
        return (this.sideA != this.sideB ) && (this.sideB != this.sideC) && (this.sideA != this.sideC);
    }
}