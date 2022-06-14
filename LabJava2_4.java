import java.util.Scanner;

public class LabJava2_4 {

  public static void main(String[] args) {
    float time;
    Scanner times = new Scanner(System.in);
    System.out.print(" Enter Parking usage time :  ");
    time = times.nextFloat();

    if (time < 0) {
      System.out.print(" end");

    } else if (time <= 0.15) {
      System.out.print("free");
    } else if (time > 0.15 && time <= 3) {
      float x = time * 10;
      System.out.print(x);
    } else if (time > 3 && time <= 4 ) {
      float x = time * 20;
      System.out.print(x);
    } else if (time > 4) {
      float x = 200;
      System.out.print(x);
    }
  }
}