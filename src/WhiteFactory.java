import Circle.WhiteCircle;

public class WhiteFactory extends BaseFactory {
    @Override
    public Circle createCircle(double radius) {
        return new WhiteCircle(radius);
    }

    @Override
    public Triangle createTriangle(double a, double b, double c) {
        return new WhiteTriangle(a, b, c);
    }
}
