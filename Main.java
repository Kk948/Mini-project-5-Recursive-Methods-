import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
    System.out.println(" Welcome, we're here in the town to figure out whether you are a vampire of not!");
    vampire();
  }

  public static int vampire(int sun){

    System.out.println("How many minutes can you stand outside in the sun");
    Scanner scan = new Scanner(System.in);
    int sun = scan.nextInt();

   if (sun  < 4)
   {
      System.out.println("I guess we were wrong.Sorry for burning your house down");
      return true;
      
   }  
      else
   {
     System.out.println("You're a vampire,get them!");
      return Sun + vampire;
      
      
   }
  }
  
}