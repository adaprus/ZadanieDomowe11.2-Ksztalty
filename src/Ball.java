public class Ball extends  Shape3D{
    private double radius;

    public Ball(double radius) {
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
        return "Kula o promieniu " + radius;
    }

    @Override
    public double volume(Shape3D shape) {
        return 4.0 / 3 * Math.PI * Math.pow(getRadius(), 3);
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
