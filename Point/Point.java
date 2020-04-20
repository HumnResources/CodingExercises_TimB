package Point;

public class Point {

    private int x;
    private int y;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public Point() {}
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y) {
        return Math.sqrt( (this.x - x) + (this.y - y) * (this.y - y) );
    }
    public double distance() {
        return distance(0,0);
    }
    public double distance(Point otherPoint) {
        return distance(otherPoint.x, otherPoint.y);
    }
    // Distance calculation between A(xA,yA) B(xB,yB)
    // d(A,B) = SQRT (xB-xA) + (yB-yA) * (yB-yA)
}
