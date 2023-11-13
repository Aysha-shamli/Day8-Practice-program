package lineComparison;
public class Main {
    public static void main(String[] args) {

        System.out.println(Display.welcomeMessage);

        lineCalculation myLine = new lineCalculation(3, 4, 7, 1);

        double length = myLine.calculateLength();
        System.out.println("Length of the line: " + length);
    }
}
