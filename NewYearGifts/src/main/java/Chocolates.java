public class Chocolates implements Gift
{
    String name;
    double weight;
    int no_of_chocolates;
    Chocolates(String s,double w,int n)
    {
        name=s;
        weight=w;
        no_of_chocolates=n;
    }

    public Chocolates() {

    }

    public void display_details() {
        System.out.println("chocolate Name: "+name);
        System.out.println("Total Weight of Sweet: "+weight*no_of_chocolates);
    }

    public double get_weight()
    {
        return weight;
    }

}
