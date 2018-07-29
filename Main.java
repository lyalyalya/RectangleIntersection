package IntersectionArea;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Rectangle first = null;
        Rectangle second = null;
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("first rectangle");
            first = ReadPoint(in);
            System.out.println("second rectangle");
            second = ReadPoint(in);
        } catch (NumberFormatException | IOException e) {
            System.out.println(e);
        }
        System.out.println(new Intersection(first, second).getArea());
    }

    public static Rectangle ReadPoint(BufferedReader in) throws IOException {
        double x1 = 0;
        double y1 = 0;
        double x2 = 0;
        double y2 = 0;
        System.out.println("Enter 2 coordinates for the first point each in new line");
        x1 = Double.parseDouble(in.readLine());
        y1 = Double.parseDouble(in.readLine());
        System.out.println("Enter 2 coordinates for the second point each in new line");
        x2 = Double.parseDouble(in.readLine());
        y2 = Double.parseDouble(in.readLine());
        return new Rectangle(new Point(x1, y1), new Point(x2, y2));
    }
}

