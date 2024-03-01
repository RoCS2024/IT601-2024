package com.point.distance.app.point;

/**
 * Shows a point in a two-dimensional coordinate system.
 */
public class Point {

    private double x; // x-coordinate of the point
    private double y; // y-coordinate of the point

    /**
     * Makes a new point with given x and y coordinates.
     * @param x The x-coordinate of the point.
     * @param y The y-coordinate of the point.
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x-coordinate of the point.
     * @return The x-coordinate of the point.
     */
    public double getX() {
        return x;
    }

    /**
     * Sets the x-coordinate of the point.
     * @param x The new x-coordinate of the point.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Gets the y-coordinate of the point.
     * @return The y-coordinate of the point.
     */
    public double getY() {
        return y;
    }

    /**
     * Sets the y-coordinate of the point.
     * @param y The new y-coordinate of the point.
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Calculates the distance between this point and another point.
     * @param otherPoint The other point to calculate the distance to.
      */
    public double getDistanceFrom(Point otherPoint) {
        double dx = this.x - otherPoint.getX();
        double dy = this.y - otherPoint.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
