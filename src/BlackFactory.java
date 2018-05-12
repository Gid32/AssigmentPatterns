import circle.BlackCircle;
import circle.Circle;

public class BlackFactory extends BaseFactory {

    public BlackFactory(BaseFactory baseFactory) {
    }
//
//    public BlackTriangle createBlackTriangle(double side1, double side2, double side3) {
//        BlackTriangle blackTriangle = new BlackTriangle();
//        blackTriangle.setSide1(side1);
//        blackTriangle.setSide2(side2);
//        blackTriangle.setSide3(side3);
//        blackTriangle.setColor(COLOR);
//        return blackTriangle;
//    }

//    public BlackCircle createBlackCircle(double radius) {
//        BlackCircle blackCircle = );
//        blackCircle.setRadius(radius);
//        blackCircle.setColor(COLOR);
//        return blackCircle;
//    }

    @Override
    public Circle createCircle(double radius) throws Exception {
        return new BlackCircle(radius);
    }

    @Override
    public Triangle createTriangle(double a, double b, double c) {
        return null;
    }
}
