//메소드 오버로딩이란 같은 이름의 메소드를 중복하여 정의하는 것을 의미한다.

 /*자바는 원래 한 클래스 내에 같은 이름의 메소드를 둘 이상 가질 수 없다.
 그러나,
 매개변수의 개수 또는 매개변수의 타입을 다르게 넣어줌으로서, 하나의 이름으로 여러 메소드를 작성할 수 있다.

   // 이때 메소드에 선언된 매개변수 타입,개수,순서 를 포함하여 
    // ' 메소드 시그니처 ' 라고 부른다.
      // 즉, 메소드 시그니처를 다르게 함으로써 메소드 오버로딩을 활용할 수 있는것이다.

  이런 메소드 오버로딩을 사용하면

   -메소드에 사용되는 이름을 절약할 수 있다.
   -오버로딩으로 여러 메소드를 만들어 둘 시, 메소드 호출에 있어 매개변수의 개수나 데이터타입을 크게 신경쓰지 않고 호출할 수 있다.

  바로 이런 특징을 가지는 메소드 오버로딩이 '객체지향언어'인 자바의 가장 두드러지는 특징 중 하나인 '다형성 ( polymorphism' ) 의 대표적 용례이다.
 */
import java.util.*;
class Test {
	static void display(int num1){ //시그니처1 메소드
     System.out.println(num1); 
     }
  
	static void display(int num1, int num2){ //시그니처2 메소드
     System.out.println(num1 * num2); 
     }

	static void display(int num1, double num2){// 시그니처 3 메소드
     System.out.println(num1 + num2); 
     }
  
  
}

public class prac15_methodOverloading {
	public static void main(String[] args) {
	  Test myfunc = new Test();

		myfunc.display(99);
		myfunc.display(99, 66);
		myfunc.display(99, 11.11);
		myfunc.display(99, 'a');
	}
}
 
