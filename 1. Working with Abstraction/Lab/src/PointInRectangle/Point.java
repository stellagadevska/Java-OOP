package PointInRectangle;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isLessOrEqual(Point point) {
        return point.x <= this.x && point.y <= this.y;
    }

    public boolean isGreaterOrEqual(Point point) {
        return point.x >= this.x && point.y >= this.y;
    }
}
