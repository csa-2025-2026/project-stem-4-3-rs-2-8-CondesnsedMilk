import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    /*
    for(int i = 1; i <= 25; i += 2)
    {
      System.out.println(i);
    }
    */

    /*
    for(i = 17; i <= 73; i++)
    {
      System.out.print(i + " ");
      if(i % 10 == 6)
      {
        System.out.println();
      }
      
    }
    */

    System.out.print("Etner in a number between 0 and 50: ");
    Scanner scan = new Scanner(System.in);
    int scannedInt = scan.nextInt();

    if(scannedInt < 0 || scannedInt > 50)
    {
      System.out.println("error");
    }
    else
    {
      for(int i = scannedInt; i <= 50; i++)
      {
        System.out.print(i + " ");
        if(i % 5 == (scannedInt+4) % 5)
        {
          System.out.println();
        }

      }
    }

  }
}
