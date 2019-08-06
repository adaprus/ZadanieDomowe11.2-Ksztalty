public class ShapeTest {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        Rectangle rectangle = new Rectangle(3.5, 7);
        Circle circle = new Circle(3);
        Point point1 = new Point(2, 5);
        Point point2 = new Point(0, 0);
        Line2D line2D = new Line2D(point1, point2);
        Cube cube = new Cube(4);
        Ball ball = new Ball(3);

        System.out.print("Pole prostokąta " + rectangle.toString() + " wynosi ");
        System.out.printf("%.2f \n", calculator.rectangleArea(rectangle));
        System.out.print("Pole koła " + circle.toString() + " wynosi ");
        System.out.printf("%.2f \n", calculator.circleArea(circle));
        System.out.print("Długość odcinka " + line2D.toString() + " wynosi ");
        System.out.printf("%.2f \n", calculator.lineLength(line2D));
        System.out.print("Objętość kuli " + ball.toString() + " wynosi ");
        System.out.printf("%.2f \n", calculator.ballVolume(ball));
        System.out.print("Objętość sześcianu " + cube.toString() + " wynosi ");
        System.out.printf("%.2f \n", calculator.cubeVolume(cube));
    }
}
