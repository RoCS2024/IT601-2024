abstract class DrawingTool {
    protected char[][] canvas;

    public DrawingTool(int width, int height) {
        canvas = new char[height][width];
        for (char[] row : canvas) {
            for (int i = 0; i < row.length; i++) {
                row[i] = ' ';
            }
        }
    }
    public abstract void draw(int x, int y);

    public void displayCanvas() {
        for (char[] row : canvas) {
            System.out.println(row);
        }
    }
}

class Pen extends DrawingTool {
    public Pen(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw(int x, int y) {
        if (isValidCoordinate(x, y)) {
            canvas[y][x] = 'X';
        } else {
            System.out.println("Invalid coordinates for drawing pen.");
        }
    }

    private boolean isValidCoordinate(int x, int y) {
        return x >= 0 && x < canvas[0].length && y >= 0 && y < canvas.length;
    }

    private static boolean isValidCoordinate(int x, int y, char[][] canvas) {
        return x >= 0 && x < canvas[0].length && y >= 0 && y < canvas.length;
    }
}

class Pencil extends DrawingTool {
    public Pencil(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw(int x, int y) {
        if (isValidCoordinate(x, y)) {
            canvas[y][x] = 'X';
        } else {
            System.out.println("Invalid coordinates for drawing pencil.");
        }
    }

    private boolean isValidCoordinate(int x, int y) {
        return false;
    }
}

class Eraser extends DrawingTool {
    public Eraser(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw(int x, int y) {
        if (isValidCoordinate(x, y)) {
            canvas[y][x] = ' ';
        } else {
            System.out.println("Invalid coordinates for using eraser.");
        }
    }

    private boolean isValidCoordinate(int x, int y) {
        return false;
    }
}
