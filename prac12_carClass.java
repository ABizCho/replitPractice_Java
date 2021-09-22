import java.util.*;
public class prac12_carClass{
      
      //
      String name;     //자동차 이름
      String color;    //자동차 색깔
      int createYear;  //제조년도       
      
      //메소드
        //행위
      void carUp(){
        System.out.println("전진합니다.");
      }
      void carDown(){
        System.out.println("후진합니다."); 
      }
        //반환
      int carCreateYear(){
        return this.createYear;
      }
      String carName(){
        return this.name;
      }

        //get입력
      void getCarCreateYear(int year){
        this.createYear = year;
      }
      void getCarName(String name){
        this.name = name;
      }

       //show
       void showInfo(){
         System.out.println("======<< Car Info >>========");
         System.out.printf("이름 : %s\n",this.name);
         System.out.printf("제조년월 : %d\n",this.createYear);
         System.out.println("============================");
       }
      
      
      //main

      public static void main(String[] args)
      {
        prac12_carClass car1 = new prac12_carClass(); // Car클래스의 인스턴스 car1생성

        car1.carUp(); //메소드호출
        car1.carDown(); //메소드호출

        car1.getCarCreateYear(20210920); //메소드 호출
        car1.getCarName("cho");
        System.out.println(car1.carCreateYear()); //메소드 호출
        System.out.println(car1.carName());


        car1.showInfo();

      }
}
