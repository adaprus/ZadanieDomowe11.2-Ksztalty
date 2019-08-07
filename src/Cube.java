public class Cube extends Shape3D {
    private double line;

    public Cube(double line) {
        this.line = line;
    }

    public double getLine() {
        return line;
    }

    public void setLine(double line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "Sześcian o długości krawędzi " + line;
    }

    @Override
    public double volume(Shape3D shape) {
        return Math.pow(getLine(), 3);
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
