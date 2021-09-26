import java.util.*;
//Abstract Method (추상 메소드)
  // 추상메소드란 : 추상메소드란 자식클래스에서 반드시 오버라이딩해야만 사용할 수 있는 메소드를 의미한다.
    
    // 목적 : 추상메소드가 포함된 부모 클래스를 상속받는 자식클래스가 반드시 추상 메소드를 구현하도록 하기 위함이다.
      // -> 이로인해, 모듈처럼 중복되는 부분이나 클래스가 공통적으로 가져야할 부분은 미리 다 만들어진 것을 사용하고, 이를 받아 사용하는 자식클래스쪽에서는 자식으로써 필요한 개별화된 특성들만 재정의하여 사용함으로써 생산성이 향상되고 배포등이 쉬워지기 때문이다.


    // 모습 : 이런 부모클래스 내의 추상메소드는 선언부만이 존재하며 구현부는 작성되어있지 않은데, 바로 이 작성되어있지 않은 구현부를 자식 클래스에서 메소드 오버라이딩 하여 사용하는 것이다.

abstract class Animal // 추상 부모클래스
{
  abstract void cry(); // 클래스 내 추상메소드 선언(선언만 존재 구현은 자식에서 오버라이딩 필수)
}

class giraffe extends Animal
{
  void cry(){
    System.out.println("기리인 기리인"); // 부모의 추상메소드 상속받아 자식에서 오버라이딩하여 구현
  }
}

class cat extends Animal
{
  void cry(){
    System.out.println("야옹 야옹"); //  부모의 추상메소드 상속받아 자식에서 오버라이딩하여 구현
  }
}

public class prac17_abstractClass
{
  public static void main(String[] args){
    // 중요 : 추상클래스 그 자체로는 인스턴스를 생성할 수 없음
      // 추상클래스를 상속받은 자식클래스로 인스턴스를 생성

    cat cat1 = new cat();
    cat1.cry();

    giraffe giraffe1 = new giraffe();
    giraffe1.cry();

  }
}


