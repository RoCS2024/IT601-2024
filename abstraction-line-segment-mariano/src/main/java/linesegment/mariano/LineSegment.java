package main.java.linesegment.mariano;

class LineSegment {
    private int x1, y1, x2, y2;
    private static boolean startsWithOrigin = false;

    public LineSegment(int x1, int y1, int x2, int y2) {
        if (startsWithOrigin) {
            this.x1 = 0;
            this.y1 = 0;
        } else {
            this.x1 = x1;
            this.y1 = y1;
        }
        this.x2 = x2;
        this.y2 = y2;
    }

    public double slope() { //double to show the exact value
        if (x2 - x1 == 0) {
            return Double.POSITIVE_INFINITY; // Vertical line, infinite slope
        } else {
            return (double) (y2 - y1) / (x2 - x1);
        }
    }

    public double distance() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); //subtract then raise to the power of 2 then add both value then get the square root
    }

    public static void setStartsWithOrigin(boolean value) {
        startsWithOrigin = value;
    }
}

