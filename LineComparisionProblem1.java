import java.util.Scanner;

class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Line implements Comparable<Line> 
{
    Point startPoint, endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    // Calculate the length of the line
    public double length() {
        return Math.sqrt(Math.pow(endPoint.x - startPoint.x, 2) + Math.pow(endPoint.y - startPoint.y, 2));
    }

    // Check equality of two lines based on their lengths
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Line otherLine = (Line) obj;

        return Double.compare(this.length(), otherLine.length()) == 0;
    }

    // Compare lines based on their lengths
    @Override
    public int compareTo(Line otherLine) {
        return Double.compare(this.length(), otherLine.length());
    }
}

public class LineComparisonProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);

        // Input the coordinates of the two points for the first line
        System.out.print("Enter the x-coordinate of the first point for line 1: ");
        double x1Line1 = sc.nextDouble();

        System.out.print("Enter the y-coordinate of the first point for line 1: ");
        double y1Line1 = sc.nextDouble();

        System.out.print("Enter the x-coordinate of the second point for line 1: ");
        double x2Line1 = sc.nextDouble();

        System.out.print("Enter the y-coordinate of the second point for line 1: ");
        double y2Line1 = sc.nextDouble();

        // Input the coordinates of the two points for the second line
        System.out.print("Enter the x-coordinate of the first point for line 2: ");
        double x1Line2 = sc.nextDouble();

        System.out.print("Enter the y-coordinate of the first point for line 2: ");
        double y1Line2 = sc.nextDouble();

        System.out.print("Enter the x-coordinate of the second point for line 2: ");
        double x2Line2 = sc.nextDouble();

        System.out.print("Enter the y-coordinate of the second point for line 2: ");
        double y2Line2 = sc.nextDouble();

        // Creating points and lines
        Point startPointLine1 = new Point(x1Line1, y1Line1);
        Point endPointLine1 = new Point(x2Line1, y2Line1);
        Line line1 = new Line(startPointLine1, endPointLine1);

        Point startPointLine2 = new Point(x1Line2, y1Line2);
        Point endPointLine2 = new Point(x2Line2, y2Line2);
        Line line2 = new Line(startPointLine2, endPointLine2);

        if (line1.equals(line2)) {
            System.out.println("The lengths of the two lines are equal using equals method.");
        } else {
            System.out.println("The lengths of the two lines are not equal using equals method.");
        }

        int comparisonResult = line1.compareTo(line2);
        if (comparisonResult == 0) {
            System.out.println("The lengths of the two lines are equal using compareTo method.");
        } else if (comparisonResult < 0) {
            System.out.println("Line 1 is shorter than Line 2 using compareTo method.");
        } else {
            System.out.println("Line 1 is longer than Line 2 using compareTo method.");
        }
    }
}