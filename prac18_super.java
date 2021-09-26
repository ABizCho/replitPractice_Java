//JAVA에서 super.__ / super.___() 란 상위클래스의 변수나 메소드로의 접근을 위한 키워드이다.

//상위 클래스 접근 in JAVA :  super.___()
  //in C++ :   부모클래스명::___()
  //in python :   super().___()


class A{ // 부모 클래스 A를 선언
  public void fn(){ // 부모 클래스의 public 메소드 fn() 선언 
    System.out.println("A"); // fn() 메소드 구현
    }
}

class B extends A{ //A상속 자식 클래스B 
  public void fn(){
    super.fn();  // super키워드로 B의 상위클래스 A의 메서드 fn()호출
    System.out.println("B");
  }
}

public class prac18_super
{
  public static void main(String[] args)
  {
    A A1 = new A();
    B B1 = new B();

    A1.fn();
    System.out.println("");
    B1.fn();

  }

}


