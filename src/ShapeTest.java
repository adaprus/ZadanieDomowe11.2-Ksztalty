public class ShapeTest {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        Shape[] shapes = new Shape[5];
        shapes[0] = new Rectangle(3.5, 7);
        shapes[1] = new Circle(3);
        Point point1 = new Point(2, 5);
        Point point2 = new Point(0, 0);
        shapes[2] = new Line2D(point1, point2);
        shapes[3] = new Cube(4);
        shapes[4] = new Ball(3);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString());
            String type = shapes[i].getType();
            switch(type){
                case "line":
                    System.out.printf("Długość wynosi %.2f \n", calculator.lineLength((Line2D)shapes[i]));
                    break;
                case "shape2D":
                    System.out.printf("Pole wynosi %.2f \n", calculator.shapeArea((GeometricShape)shapes[i]));
                    break;
                case "shape3D":
                    System.out.printf("Objętość wynosi %.2f \n", calculator.volume((Shape3D)shapes[i]));
                    break;
                default:
                    System.out.println("Nie umiem policzyć :( \n");
            }
        }
    }
}
