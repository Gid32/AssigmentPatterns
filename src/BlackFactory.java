public class BlackFactory extends BaseFactory {
    private BaseFactory baseFactory;
    private static final String COLOR = "black";

    public BlackFactory(BaseFactory baseFactory) {
        this.baseFactory = baseFactory;
    }

    public void createBlackTriangle(double side1, double side2, double side3) {
        BlackTriangle blackTriangle = (BlackTriangle) baseFactory.createTriangle();
        blackTriangle.setSide1(side1);
        blackTriangle.setSide2(side2);
        blackTriangle.setSide3(side3);
        blackTriangle.setColor(COLOR);
    }

    public void createBlackCircle(double radius) {
        BlackCircle blackCircle = (BlackCircle) baseFactory.createCircle();
        blackCircle.setRadius(radius);
        blackCircle.setColor(COLOR);
    }
}
