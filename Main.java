package lineComparison;
public class Main {
    public static void main(String[] args) {

        System.out.println(Display.welcomeMessage);

        lineCalculation Line1 = new lineCalculation(3, 4, 7, 1);
        lineCalculation Line2 = new lineCalculation(5, 7, 9, 2);

        double length1 = Line1.calculateLength();
        System.out.println("Length of the line1: " + length1);
        double length2 = Line2.calculateLength();
        System.out.println("Length of the line2: " + length2);

        if (length1==length2) {
            System.out.println("The lines are equal.");
        } else {
            System.out.println("The lines are not equal.");
        }
    }
}
