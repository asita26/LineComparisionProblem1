import java.util.*;
public class LineComparisonProblem1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);

        // Input the coordinates of the two points for the line
        System.out.print("Enter the x-coordinate of the first point: ");
        double x1= sc.nextDouble();

        System.out.print("Enter the y-coordinate of the first point: ");
        double y1= sc.nextDouble();

        System.out.print("Enter the x-coordinate of the second point: ");
        double x2= sc.nextDouble();

        System.out.print("Enter the y-coordinate of the second point: ");
        double y2 = sc.nextDouble();
        
        double length=Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        System.out.print("Length of the line is:"+length);
        
        

       }
   }