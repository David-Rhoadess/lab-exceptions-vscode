package lab.exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class QR {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pen = new PrintWriter(System.out, true);

        // get the inputs
        pen.println("Enter 3 integers separated by space: ");
        String inputs = "";
        try {
            inputs = br.readLine();
        } catch (Exception e) {
            pen.println("Improper Input");
            return;
        }
        String[] inputstring = inputs.split(" ");
        double a = Double.parseDouble(inputstring[0]);
        double b = Double.parseDouble(inputstring[1]);
        double c = Double.parseDouble(inputstring[2]);

        // print the output
        Quadratic q = new Quadratic(a, b, c);
        double smallerRoot = -1;
        try {
            smallerRoot = q.smallerRoot();
            pen.println("smaller root is " + smallerRoot);
        } catch (DivideByZeroException d) {
            pen.println("the coefficient of x^2 is 0.");
        } catch (Exception e) {
            pen.println("Sorry, I could not compute a root.");
        }

    }
}
