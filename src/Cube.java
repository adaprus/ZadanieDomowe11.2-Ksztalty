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
        return "o długości krawędzi " + line;
    }
}
