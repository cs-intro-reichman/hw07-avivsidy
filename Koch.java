public class Koch {

    public static void curve(int n,
    	double x1, double y1,
        double x2, double y2) {

        if (n == 0) {
            StdDraw.line(x1, y1, x2, y2);
            return;
        }

        double ax = (2 * x1 + x2) / 3.0;
        double ay = (2 * y1 + y2) / 3.0;
        double bx = (x1 + 2 * x2) / 3.0;
        double by = (y1 + 2 * y2) / 3.0;

        double cx = (Math.sqrt(3) / 6) * (y1 - y2) + (x1 + x2) / 2;
        double cy = (Math.sqrt(3) / 6) * (x2 - x1) + (y1 + y2) / 2;

        curve(n - 1, x1, y1, ax, ay);
        curve(n - 1, ax, ay, cx, cy);
        curve(n - 1, cx, cy, bx, by);
        curve(n - 1, bx, by, x2, y2);
    }
}
