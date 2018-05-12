package circle;

/**
 * Created by dmytro-mikhieiev on 08.05.2018.
 */
public class WhiteCircle extends Circle {

    public WhiteCircle(double radius) throws Exception {
        super(radius, "white");
    }

    @Override
    public double calculateSquare() {
        return (3.14 * Math.pow(radius,2));
    }

    @Override
    public double calculatePerimeter() {
        return (2 * 3.14 * radius);
    }

}