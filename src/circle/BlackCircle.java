package circle;

/**
 * Created by dmytro-mikhieiev on 08.05.2018.
 */
public class BlackCircle extends Circle {

    public BlackCircle(int radius) throws Exception {
        super(radius, "black");
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
