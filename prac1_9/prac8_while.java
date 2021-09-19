import java.util.*;

public class prac8_while{
  public static void main(String[] args){

    int i = 0;
    int sum = 0;

    while (i < 10){
      i++;
      
      sum = sum + i ;
      System.out.printf("sum(%d) : %d\n",i,sum);
    }

  }
}