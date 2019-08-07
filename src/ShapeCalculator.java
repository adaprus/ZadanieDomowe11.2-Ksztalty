public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    @Override
    public double shapeArea(GeometricShape shape) {
        return shape.shapeArea(shape);
    }

    @Override
    public double volume(Shape3D shape) {
        return shape.volume(shape);
    }
}
