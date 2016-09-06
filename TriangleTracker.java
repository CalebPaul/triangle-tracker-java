import java.io.Console;


public class TriangleTracker {
  public static void main(String[] args) {
    Console myConsole = System.console();


    System.out.println("Enter a value for side one:");
    Integer userSideOne = Integer.parseInt(myConsole.readLine());
    System.out.println("Enter a value for side two:");
    Integer userSideTwo = Integer.parseInt(myConsole.readLine());
    System.out.println("Enter a value for side three:");
    Integer userSideThree = Integer.parseInt(myConsole.readLine());
    Triangle userTriangle = new Triangle(userSideOne, userSideTwo, userSideThree);

    if (userTriangle.notTriangle()) {
      System.out.println("This is not a triangle.");

    } else if (userTriangle.equilateral()) {
      System.out.println("This is an equilateral triangle.");

    } else if (userTriangle.isosceles()) {
      System.out.println("This is an isosceles triangle.");

    } else if (userTriangle.scalene()) {
      System.out.println("This is a scalene triangle.");
    }
  }
}
