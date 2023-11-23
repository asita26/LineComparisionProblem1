import java.util.*;


public class LineComparisonProblem1 {

    //adding a function to calculate length
    public static double calculatingLength(double x1, double y1, double x2, double y2)
    {
       double length=Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
       return length;
    }
    

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);

        // Input the coordinates of the two points for the line
        System.out.print("Enter the x-coordinate of the first point of line 1: ");
        double x1Line1= sc.nextDouble();

        System.out.print("Enter the y-coordinate of the first point of line 1: ");
        double y1Line1= sc.nextDouble();

        System.out.print("Enter the x-coordinate of the second point of line 1: ");
        double x2Line1= sc.nextDouble();

        System.out.print("Enter the y-coordinate of the second point of line 1: ");
        double y2Line1 = sc.nextDouble();

        System.out.print("Enter the x-coordinate of the first point of line 2: ");
        double x1Line2= sc.nextDouble();

        System.out.print("Enter the y-coordinate of the first point of line 2: ");
        double y1Line2= sc.nextDouble();

        System.out.print("Enter the x-coordinate of the second point of line 2: ");
        double x2Line2= sc.nextDouble();

        System.out.print("Enter the y-coordinate of the second point of line 2: ");
        double y2Line2= sc.nextDouble();
        
        //calculating lengths of induvidual line
        double lengthLine1 = calculatingLength(x1Line1, y1Line1, x2Line1, y2Line1);
        double lengthLine2 = calculatingLength(x1Line2, y1Line2, x2Line2, y2Line2);

        // System.out.print("Length of the line 1 is:"+lengthLine1);
        // System.out.print("Length of the line 2 is:"+lengthLine2);

        if(lengthLine1 == lengthLine2 ) System.out.println("The length of both lines are equal.");
        else System.out.println("The length of both lines are not equal");
        

       }
   }