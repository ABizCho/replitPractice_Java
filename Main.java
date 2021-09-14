import java.util.*;            
public class Main
{
  public static void main(String[] args)
  {
    //1.HashSet (중복X/순서중요X/집합자료구조)
    HashSet hs = new HashSet();
    hs.add(3);
    hs.add(4);
    hs.remove(3);
    
    System.out.println(hs);
    System.out.println(hs.size());
    /* 1.HashSet : 원소의 중복을 허용하지 않는 Set클래스로 저장순서는 중요하지 않다 */
    //Hash ds_hashset1 = new HashSet();
    //ds_hashset1.add(1);
    //System.out.println(ds_hashset1);
    
    
    System.out.println(" ");
    
    
    //2.HashMap (키/값으로 구성된 딕셔너리형 자료구조)
    HashMap hm = new HashMap();
    hm.put(1,"a");
    hm.put(2,"B");
    hm.put(2,"b");
    hm.put(3,"c");
    hm.remove(3);
    System.out.println(hm);
    System.out.println(hm.get(1));
    
    System.out.println("\n");
    
    //3.ArrayLIst (선형리스트구조로, 순서가 중요함,인덱스로 접근가능)
    ArrayList AL = new ArrayList();
    AL.add(1);
    AL.add(2);
    
    AL.add(2,3);
    AL.remove(2); //인덱스로 제거
    
    
    System.out.println(AL);
    System.out.println(AL.get(1));
    //4.LinkedList (이전노드와 직후노드의 정보를 알고있음)
  }
}