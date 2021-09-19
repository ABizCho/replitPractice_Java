import java.util.*;

public class prac6_if{
  public static void main(String[] args){
    int intVar;

    
    Scanner c = new Scanner(System.in);
    
    System.out.print("정수를 입력하세요: ");
    intVar =c.nextInt();

    if ( intVar % 2 ==0 ){
      System.out.println("짝수입니다.");
    }
    else {
      System.out.println("홀수입니다.");
    }
    
  }
  
}