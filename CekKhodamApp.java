
import java.util.Scanner;
import java.util.Random;


public class CekKhodamApp{
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    while(true){
      
      String userKhodam = getKhodam();
      
      System.out.println("Enter e for exit");
      System.out.print("Enter your name : ");
      String name = scan.nextLine();
      
      if(name.equals("e")) break;
      
      System.out.println();
      System.out.println(name + " khodam kamu adalah " + userKhodam);
      System.out.println();
      
    }
    
  }
  
  
  /**
   * method for get random khodam 
   */
  public static String getKhodam(){
    
    Random random = new Random();
    
    /**
     * list of khodam
     */
    String[] khodam = {"macan", "semut", "kucing", "manuk", "tidak ada", "nyamuk", "paus", "kamitetep", "monyet", "nasi padang", "javascript", "php"};
    
    return khodam[random.nextInt(khodam.length)];
    
  }
  
  
  
} 