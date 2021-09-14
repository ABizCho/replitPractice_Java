import java.util.*;

public class io_5{
  public static void main(String[] args){
    
    //출력형식
    int a = 1;
    System.out.println(a);
    System.out.printf("%d",a);
    
    //입력형식 :Scanner class
    int i;
    float f;
    double d;
    String s;
    
    Scanner c = new Scanner(System.in); //Scanner 클래스
    
    
    System.out.println("start");
    
    s = c.nextLine();
    System.out.println(s);
    
    i = c.nextInt(); //int 입력받아출력
    System.out.println(i);
    
    f = c.nextFloat();
    System.out.println(f);
    
    d = c.nextDouble();
    System.out.println(d);
    
    System.out.println("end");
    
  } 
}