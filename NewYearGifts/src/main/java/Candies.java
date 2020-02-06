public class Candies implements Gift
{
    String name1;
    int price1;
    double weight1;
    Candies(String name,double weight,int price)
    {
        //super();
        name1=name;
        weight1=weight;
        price1=price;
    }
    @Override
    public void display_details() {
        System.out.println("Name of the candy: "+name1);
        System.out.println("weight the of candy: "+weight1);
        System.out.println("price of the candy: "+price1);
    }

    public  int getPrice()
    {
        return price1;
    }

}
