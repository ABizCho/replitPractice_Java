import java.util.*;

public class prac11_calculatorMethod
{
  
  public static int sum(int n1,int n2)
  {
    int result;
    result = n1 + n2;
    
    return result;
  }

  public static void main(String[] args)
  {
    int r1;
    int r2;

    r1 = sum(10,20);
    r2 = sum(20,30);

    System.out.println(r1);
    System.out.println(r2);
  }
}