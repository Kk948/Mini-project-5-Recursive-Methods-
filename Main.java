import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //This welcomes the user into the program
    System.out.println(" Welcome, we're here in the town to figure out whether you are a vampire of not!");
    //then it's asking the user how long can they stand in sun and saving it in the variable sun
    System.out.println("How many minutes can you stand outside in the sun");
    Scanner scan = new Scanner(System.in);
    int sun = scan.nextInt();
    //the vampire method is being called 
    vampire(sun);
  }
  public static boolean vampire(int sun) {
    Scanner scan = new Scanner(System.in);
    //This is stating if the sun variable is less that 4 then they are a vampire
    if (sun <= 4) {
      System.out.println("You're a vampire,get them!");
      return true;
      //the recursive method is here and repeats the question and updates the variable sun forever until the variable is equal to 4
    } else {
        System.out.println("How many minutes can you stand outside in the sun");
        sun = scan.nextInt();
        return vampire( sun);

    }
  }

}