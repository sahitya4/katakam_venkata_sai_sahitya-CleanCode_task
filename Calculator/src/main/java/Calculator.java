import java.lang.Math;
public class Calculator
{
  double a,b;
  char c;
  Calculator(double num1,double num2)
  {
      a=num1;
      b=num2;

  }
}

class Addition extends Calculator
{
   double result;
   Addition(double num1,double num2)
   {
       super(num1,num2);
       result=a+b;
   }
   public void display()
   {
       System.out.println("Addition of two numbers is: "+result);
   }
}

class Subtraction extends Calculator
{
    double result;
    Subtraction(double num1,double num2)
    {
        super(num1,num2);
        result=a-b;
    }
    public void display()
    {
        System.out.println("Subtracion of two numbers is: "+result);
    }
}

class Multiplication extends Calculator
{
    double result;
   Multiplication(double num1,double num2)
    {
        super(num1,num2);
        result=a*b;
    }
    public void display()
    {
        System.out.println("Multiplication of two numbers is: "+result);
    }
}

class Division extends Calculator
{
    double result;
    Division(double num1,double num2)
    {
        super(num1,num2);
        result=a*b;
    }
    public void display()
    {
        System.out.println("Division of two numbers is: "+result);
    }
}

class Power extends Calculator
{
    double result;
    Power(double num1,double num2)
    {
        super(num1,num2);
        result=java.lang.Math.pow(a,b);
    }
    public void display()
    {
        System.out.println("Power of two numbers is: "+result);
    }
}

