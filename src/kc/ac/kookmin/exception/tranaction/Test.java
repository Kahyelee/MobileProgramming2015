package kc.ac.kookmin.exception.tranaction;

class ExceptionA extends Exception{
   
}

class ExceptionB extends Exception{
   
}

class ExceptionC extends Exception{
   
}


class Bank {
   private int balance = 1000;
   public void oneqTrade() {
      
      try{
         tradeWithA();
         tradeWithB();         
         tradeWithC();
      }
      catch(ExceptionA a){
         System.out.println("A���� �ŷ� ���� �߻�");
         cancelA();
      }
      catch(ExceptionB e){
         System.out.println("B���� �ŷ� ���� �߻�");
         cancelB();
         cancelA();
      }
      catch(ExceptionC e){
         System.out.println("C���� �ŷ� ���� �߻�");
         cancelC();
         cancelB();
         cancelA();
      }
      finally{
         System.out.println("�ܿ� �ݾ� : " + balance); // ���� �߻��� �ܿ��ݾ��� ó�� �ݾװ� ���� �ϰ� �ʹ�.
      }
            
   }
   
   public void tradeWithA () throws ExceptionA{
      int m = 100; // A���¿��� ����� �ݾ�
      
      System.out.println("A ���¿��� ��� - " + m);
      balance -= m;      
   }
   public void tradeWithB() throws ExceptionB{
      int m = 200;
      
      System.out.println("B ���¿��� ��� - " + m);
      balance -= m;
      
   }
   public void tradeWithC() throws ExceptionC{
      int m = 300;
      
      System.out.println("C ���¿��� ��� - " + m);
      balance -= m;
      ExceptionC ex = new ExceptionC();
      throw ex;
   }
   
    public void cancelA() {
      System.out.println("A ���� �ŷ� ���  ");
      balance += 100;
   }
   public void cancelB() {
      System.out.println("B ���� �ŷ� ���  ");
      balance += 200;
   }
   public void cancelC() {
      System.out.println("C ���� �ŷ� ���  ");
      balance += 300;
   }
}

public class Test {
    public static void main(String args[]) {
       Bank b = new Bank();
       b.oneqTrade();
    }
} 