public class Calculator
{
  double a,b;
  char c;
  Calculator(double num1,double num2,char op)
  {
      a=num1;
      b=num2;
      c=op;
  }
}

class Addition extends Calculator
{
   double result;
   Addition(double num1,double num2,char op)
   {
       super(num1,num2,op);
   }
}