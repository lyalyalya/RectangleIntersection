package IntersectionArea;

public class Rectangle {
    private double left;
    private double right;
    private double top;
    private double bottom;

    public Rectangle(Point a, Point b) {
        this.left = Math.min(a.x, b.x);
        this.right = Math.max(a.x, b.x);
        this.top = Math.max(a.y, b.y);
        this.bottom = Math.min(a.y, b.y);
    }

    public double getLeft() {
        return left;
    }

    public double getRight() {
        return right;
    }

    public double getTop() {
        return top;
    }

    public double getBottom() {
        return bottom;
    }

}
