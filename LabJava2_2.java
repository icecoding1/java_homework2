import java.lang.Math;
import java.util.Scanner;

public class LabJava2_2 {
    private double radius;
    public double area() {
        return Math.PI * radius * radius; 
    }

    public void print() {
        System.out.println("radius = " + radius );
        System.out.println("area = " + area());
    }

    public static void main(String[] args) {
        Scanner InRadius = new Scanner(System.in);

        LabJava2_2 c1  = new LabJava2_2();
        System.out.print("Enter Radius: ");
        c1.radius = InRadius.nextInt();
        c1.area();
        c1.print();
    }
}
