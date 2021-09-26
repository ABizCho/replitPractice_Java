//클래스 상속 ( 부모클래스 - 자식클래스 )

class Parent {
	private int a = 10;		// private 필드
	public int b = 20;		// public 필드
}

class Child extends Parent {
	public int c = 30;		// public 필드
	void display() {
		//System.out.println(a);	
    // private,default 접근제어자는 상속은 받지만 자식클래스에서 접근은 불가 = > 라인12 실행시 오류
		System.out.println(b);		// 상속받은 public 필드 참조
		System.out.println(c);		// 자식 클래스에서 선언한 public 필드 참조
	}
}

public class prac16_classInheritance {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.display();

    //ch.a = 10; //=> private 필드는 해당 클래스 외부에서 접근불가
    ch.b = 10;  //=> public 필드는 클래스 외부에서 접근,조작 가능
    ch.c = 10;
	}
}