import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Rectangle rectangle1 = new Rectangle (4,10);
    Rectangle rectangle2 = new Rectangle (10,4);
    boolean isRotated = (rectangle1.getLength() == rectangle2.getWidth()) && (rectangle1.getWidth() == rectangle2.getLength());
    boolean isCongruent = rectangle1.equals(rectangle2) || isRotated; 
    boolean isSimilar = isCongruent || (rectangle1.getLength() / rectangle2.getLength()) == (rectangle1.getWidth() / rectangle2.getWidth()); 
    System.out.println(isRotated);
    System.out.println(isCongruent);
    System.out.println(isSimilar);

  }
}
