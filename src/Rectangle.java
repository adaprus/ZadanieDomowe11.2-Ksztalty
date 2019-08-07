public class Rectangle extends GeometricShape {
    private double line1;
    private double line2;

    public Rectangle() {
    }

    public Rectangle(double line1, double line2) {
        this.line1 = line1;
        this.line2 = line2;
    }

    public double getLine1() {
        return line1;
    }

    public void setLine1(double line1) {
        this.line1 = line1;
    }

    public double getLine2() {
        return line2;
    }

    public void setLine2(double line2) {
        this.line2 = line2;
    }

    @Override
    public String toString() {
        return "Prostokąt o bokach: " + line1 +
                " i " + line2;
    }

    @Override
    public double shapeArea(GeometricShape shape) {
        return line1 * line2;
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
