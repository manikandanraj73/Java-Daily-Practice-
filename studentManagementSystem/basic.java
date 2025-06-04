import java.util.Scanner;
class basic{

  public static void main(String[] args) throws InterruptedException {
Scanner scanner=new Scanner(System.in);
  for(int i=10;i>=1;i--){
    System.out.println(i);
    Thread.sleep(700);
    if(i==1){
      System.out.println("READY");
      Thread.sleep(700);
      System.out.println("STEDY");
      Thread.sleep(700);
      System.out.println("GO");
      System.out.println(".....");
      Thread.sleep(1000);
      
    }
  }
     System.out.println("Let's Go!!!!");
    scanner.close();
  }
  }
 

