// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) 
  {
    System.out.println("Podaj dlugosc boku przyprostokatnych n trojkata rownobocznego");
    Scanner scanner = new Scanner(System.in);
    int n=scanner.nextInt();
    System.out.println("Podaj znak z jakiego ma byc zrobiony trojkat");
    char znak=scanner.next().charAt(0);
    for(int i=0; i<n; i++)
    {
      for(int j=0;j<=i;j++)
        {
          System.out.print(znak + " " );//spacja między znakami
        }
      System.out.println();
    }
    
  }

  
}