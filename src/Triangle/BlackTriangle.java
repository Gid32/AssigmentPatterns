package Triangle;

public class BlackTriangle extends Triangle {

    public BlackTriangle(Double sideA, Double sideB, Double sideC) {
        super(sideA, sideB, sideC, "black");
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "\nColor: " + color +
               "\nSquare: " + super.calculateSquare() +
               "\nPerimeter: " + super.calculatePerimeter();

    }
}
