package circle;

/**
 * Created by dmytro-mikhieiev on 08.05.2018.
 */
public class CircleTest {

    public static void main(String[] args) {

        Circle blackCircle = null;
        try {
            blackCircle = new BlackCircle(3);
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println("Circle is " + blackCircle.color + " and its circumference = " + blackCircle.calculatePerimeter());
        System.out.println("Circle is " + blackCircle.color + " and its square = " + blackCircle.calculateSquare());
        System.out.println(blackCircle.toString());

    }
}
