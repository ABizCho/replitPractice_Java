class Car { // 클래스 선언부
	private String modelName; //필드 :private
	private int modelYear; //필드 : private
	private String color;  //필드 : private
	private int maxSpeed;  //필드 : private
	private int currentSpeed; //필드 : private
	

    // (1) Car 생성자 정의
	Car(String modelName, int modelYear, String color, int maxSpeed) { 
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = 0;
	}
	
	Car() { //(2) default형 Car() 생성자 정의
		this("소나타", 2012, "검정색", 160);	// this(..) 메소드로 다른 생성자를 호출함.
	}
	
	public String getModel() { // getModel() 메소드 정의 : public
		return this.modelYear + "년식 " + this.modelName + " " + this.color;
	}
   
  public void boundaryLine(int i){
    if(i==0) System.out.println("========================") ;
    else System.out.println("------------------------") ; 
 }
 
} // 클래스 선언부 종료



/////////////////

public class prac14_class2 {
  // 자바 클래스파일(*.java)에 public class가 존재하면 해당 클래스를 지니고있는 소스파일의 이름은 반드시 해당 public class의 이름과 같아야 합니다.
    
    //이러한 public class는 자바 클래스 파일당 단 하나씩만 가질 수 있습니다.

	public static void main(String[] args) { 
    // public class 내의 메인 메소드

		Car mycar = new Car();  //Car() default로 mycar instance 생성
    Car yourcar = new Car("M4",2021,"페리도트그린",200); // Car 생성자를 이용해 yourcar instance 생성


    mycar.boundaryLine(0);
		System.out.println(mycar.getModel());
    mycar.boundaryLine(1);
    
    yourcar.boundaryLine(0);
    System.out.println(yourcar.getModel());
    yourcar.boundaryLine(1);
	}
}