public class Circle extends GeometricShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Okrąg o promieniu " + radius;
    }

    @Override
    public double shapeArea(GeometricShape shape) {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
