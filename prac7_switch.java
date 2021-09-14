import java.util.*;

public class prac7_switch{
  public static void main(String[] args){
    int score;
    
    Scanner c = new Scanner(System.in);

    System.out.print("점수를 입력하세요: ");
    score = c.nextInt();

    switch ( score/10){
      case 10:
      case 9:
       System.out.printf("%c",'A');
       break;
      
      case 8:
       System.out.printf("%c",'B');
       break;
      default:
       System.out.printf("%c",'F');
    }
    
  }
}