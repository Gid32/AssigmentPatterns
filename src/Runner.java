public class Runner {
    public static void main(String[] args) {

        try {
            BaseFactory blackFactory = AbstractFactory.getFactory("black");
            
            Triangle blackTriangle = blackFactory.createTriangle(3, 4, 5);
            System.out.println(blackTriangle);
            Circle blackCircle = blackFactory.createCircle(10);
            System.out.println(blackCircle);
            
            BaseFactory whiteFactory = AbstractFactory.getFactory("white");

            Triangle whiteTriangle = whiteFactory.createTriangle(3, 4, 5);
            System.out.println(whiteTriangle);
            Circle whiteCircle = whiteFactory.createCircle(10);
            System.out.println(whiteCircle);


        } catch (RuntimeException e) {
            System.out.println("Factory not found for specified color");
        }
    }
}
