public class Sweets implements Gift
{
  String name;
  double weight;
  int no_of_sweets;

  Sweets(String s,double w,int n)
  {
      name=s;
      weight=w;
      no_of_sweets=n;
  }

  public double getweight()
  {
      return weight;
  }

  public void display_details()
  {
        System.out.println("Sweet Name: "+name);
        System.out.println("Total Weight of Sweet: "+weight*no_of_sweets);
  }
}

