//상속연습
import java.util.*; // util패키지


//부모클래스
class Parent // 부모 클래스 정의
{
  private int a = 11; // 부모의 필드 a / private : 클래스 외 접근불가 
  public int b = 22; // 부모의 필드 b / public : 접근 완전개방

}

class Child extends Parent // 부모 parent를 상속받은 Child 클래스
{
  // 부모의 a, b를 상속받음
  public int c = 33; //상속받은 a,b외 자식만의 필드 c, public으로 추가정의
  void display() // Child의 메소드 display 정의
  {
    //System.out.println(a) <= 실행시 부모의 private를 참조 -> 오류발생
    System.out.println(b); //부모에게 상속받은 public b를 참조하여 출력
    System.out.println(c); //해당 자식클래스에서 정의한 필드 c를 참조하여 출력
  }
}

public class prac16_2classInheritance{
  public static void main(String[] args){
    Child ch1 = new Child();

    ch1.display();
  }
}

