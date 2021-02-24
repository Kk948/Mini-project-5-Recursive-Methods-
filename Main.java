import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println(" Welcome, we're here in the town to figure out whether you are a vampire of not!");
    System.out.println("How many minutes can you stand outside in the sun");
    Scanner scan = new Scanner(System.in);
    int sun = scan.nextInt();
    vampire(sun);
  }
  public static boolean vampire(int sun) {
    Scanner scan = new Scanner(System.in);
    if (sun <= 4) {
      System.out.println("You're a vampire,get them!");
      return true;

    } else {
        System.out.println("How many minutes can you stand outside in the sun");
        sun = scan.nextInt();
        return vampire( sun);

    }
  }

}