import java.util.Arrays;

public class Main
{
  public static void main(String [] args)
  {
      Sweets sw = new Sweets("kalakani",10,6);
      sw.display_details();
      System.out.println();
      int[] a = new int[5];
      a[0]= (int) sw.getweight();

      Chocolates Ch = new Chocolates("DairyMilk",100,10);
      Ch.display_details();
      System.out.println();
      a[1]= (int) Ch.get_weight();

      Sweets sw1 = new Sweets("kajukatri",20,5);
      sw1.display_details();
      System.out.println();
      a[2]= (int) sw1.getweight();

      Chocolates Ch1 = new Chocolates("Mars",50,4);
      Ch1.display_details();
      System.out.println();
      a[3]= (int) Ch1.get_weight();

      Sweets sw2 = new Sweets("Badusha",15,4);
      sw2.display_details();
      System.out.println();
      a[4]= (int) sw2.getweight();

      Candies ca = new Candies("Mintoes",10,10);
      ca.display_details();
      System.out.println();
      int[] b = new int[4];
      b[0]=ca.getPrice();

      Candies ca1 = new Candies("Jelly",5,5);
      ca1.display_details();
      System.out.println();
      b[1]=ca1.getPrice();


      Candies ca2 = new Candies("Lollypop",5,15);
      ca2.display_details();
      System.out.println();
      b[2]=ca2.getPrice();

      Candies ca3 = new Candies("Bubblegum",5,20);
      ca3.display_details();
      System.out.println();
      b[3]=ca3.getPrice();
      int t=a[0]+a[2]+a[4];
      System.out.println("Toatal weight of sweets: "+t);
      System.out.println();

      System.out.println("Sorting chocolates and sweets based on weights :");
      Arrays.sort(a);
      for(int i=0;i<a.length;i++)
      {
          System.out.print(a[i] + " ");
      }
      System.out.println(" ");

      int c=0;
      int l=5;
      int u=30;
      for(int i=0;i<b.length;i++)
      {
          if(b[i]>=l && b[i]<=u)
          {
              c=c+1;
          }
      }
      System.out.println();
      System.out.println("No.of candies having price between the range of 5 to 30: "+c);
  }

}
