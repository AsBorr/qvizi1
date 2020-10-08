package aslan.borchashvili;

public class CalculatorService {
    String newLine = System.getProperty("line.separator"); // ახალი ხაზის სეპარატორის გამოთხოვნა(სისტემის შესაბამისი)

    // adds two integers
    public void sum(int x, int y) {
        int sum = x + y;
        System.out.println("sum(int):" + newLine + x + " + " + y + " = " + sum);
    }

    // divides two integers
    public void divide (int x, int y) {
        int division = x / y;
        System.out.println("divide(int):" + newLine + x + " / " + y + " = " + division);
    }

    // adds two doubles
    public void sum(double x, double y) {
        double sum = x + y;
        System.out.println("sum(double):" + newLine + x + " + " + y + " = " + sum);
    }

    // divides two doubles
    public void divide (double x, double y) {
        double division = x / y;
        System.out.println("divide(double):" + newLine + x + " / " + y + " = " + division);
    }
}
