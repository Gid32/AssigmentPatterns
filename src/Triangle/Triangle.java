package Triangle;
import java.math.*;

public abstract class Triangle {

    protected Double sideA;
    protected Double sideB;
    protected Double sideC;
    protected String color;

    public Triangle(Double sideA, Double sideB, Double sideC, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.color = color;
    }

    protected Double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    protected Double calculateSquare() {
        return Math.sqrt(0.5 * (calculatePerimeter() - sideA)
                * (calculatePerimeter() - sideB)
                * (calculatePerimeter() - sideC));
    };
}
