package com.point.distance.app.point.point3d;

import com.point.distance.app.point.Point;

/**
 * Point3d class
 */
public class Point3d extends Point {

    private double z; // z-coordinate of the point

    /**
     * Constructs a new Point3d object with the specified x, y, and z coordinates.
     * @param x The x-coordinate of the point.
     * @param y The y-coordinate of the point.
     * @param z The z-coordinate of the point.
     */
    public Point3d(double x, double y, double z) {


        /**
         *  Calls the superclass constructor with x and y parameters
         * */
        super(x, y);
        this.z = z;
    }

    /**
     * Gets the z-coordinate of the point.
     * @return The z-coordinate of the point.
     */
    public double getZ() {
        return z;
    }

    /**
     * Sets the z-coordinate of the point.
     * @param z The new z-coordinate of the point.
     */
    public void setZ(double z) {
        this.z = z;
    }


    /**
     * Calculates the distance between this 3D point and another 3D point.
     * @param otherPoint The other 3D point to calculate the distance to.
     * @return The distance between this 3D point and the other 3D point.
     */
    public double getDistanceFrom(Point3d otherPoint) {
        double dx = this.getX() - otherPoint.getX();
        double dy = this.getY() - otherPoint.getY();
        double dz = this.getZ() - otherPoint.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}
