package IntersectionArea;

public class Intersection {
    private double left;
    private double right;
    private double top;
    private double bottom;
    private double area;

    public Intersection(Rectangle a, Rectangle b) {
        left = Math.max(a.getLeft(), b.getLeft());
        right = Math.min(a.getRight(), b.getRight());
        top = Math.min(a.getTop(), b.getTop());
        bottom = Math.max(a.getBottom(), b.getBottom());
        area = Math.max((right - left), 0) * Math.max((top - bottom), 0);
    }

    public double getArea() {
        return area;
    }
}
