import java.util.Scanner;
public class Main
{
    public static void main(String [] args)
    {
        double operand1,operand2;
        char operator;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two operands :");
        operand1 = s.nextDouble();
        operand2 = s.nextDouble();
        System.out.println("Enter operator(+,-,*,/,^)");
        operator = s.next().charAt(0);
        if(operator=='+')
        {
            Addition a = new Addition(operand1,operand2);
            a.display();
        }
        else if(operator=='-')
        {
            Subtraction sub = new  Subtraction(operand1,operand2);
            sub.display();
        }
        else if(operator=='*')
        {
            Multiplication m = new Multiplication(operand1,operand2);
            m.display();
        }
        else if(operator=='/')
        {
            Division d = new Division(operand1,operand2);
            d.display();
        }
        else if(operator=='^')
        {
            Power p = new Power(operand1,operand2);
            p.display();
        }
        else
        {
            System.out.println("Calculation not possible");
        }
    }
}
