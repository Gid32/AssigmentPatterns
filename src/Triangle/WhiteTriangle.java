package Triangle;

public class WhiteTriangle extends Triangle {

    public WhiteTriangle(Double sideA, Double sideB, Double sideC) {
        super(sideA, sideB, sideC,"white");
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
