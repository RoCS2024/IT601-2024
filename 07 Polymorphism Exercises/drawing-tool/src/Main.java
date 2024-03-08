public class Main {
    public static void main(String[] args) {
        DrawingTool pen = new Pen(10, 5);
        DrawingTool pencil = new Pencil(10, 5);
        DrawingTool eraser = new Eraser(10, 5);

        pen.draw(2, 2);
        pencil.draw(4, 1);
        eraser.draw(6, 2);

        pen.displayCanvas();
        pencil.displayCanvas();
        eraser.displayCanvas();
    }
    
    private static boolean isValidCoordinate(int x, int y, char[][] canvas) {
        return x >= 0 && x < canvas[0].length && y >= 0 && y < canvas.length;
    }
}