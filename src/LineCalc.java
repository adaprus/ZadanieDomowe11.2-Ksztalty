public class LineCalc {
    double lineLength(Line2D line){
        return Math.sqrt(Math.pow(line.getPoint1().getX() - line.getPoint2().getX(), 2)
                + Math.pow(line.getPoint1().getY() - line.getPoint2().getY(), 2));    }
}
