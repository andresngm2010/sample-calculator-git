package ec.epn.edu.calculator;

public class CalculatorExecute {

    public static void main(String[] args){
        System.out.println("== Calculator Execute ==");

        Calculator c = new Calculator();
        System.out.println("c.addition(4,7) = "+c.addition(4,7));

        System.out.println("c.subtraction(9,2) = "+c.subtraction(9,2));

        System.out.println("== Here begin the changes ==");

        System.out.println("c.division(8,2) = "+c.division(8,2));

        System.out.println("c.multiplication(6,4) = "+c.multiplication(6,4));

        System.out.println("== Print Multiplication Table of 6");
        System.out.println("c.multiplication(6,1) = "+c.multiplication(6,1));
        System.out.println("c.multiplication(6,2) = "+c.multiplication(6,2));
        System.out.println("c.multiplication(6,3) = "+c.multiplication(6,3));
        System.out.println("c.multiplication(6,4) = "+c.multiplication(6,4));
        System.out.println("c.multiplication(6,5) = "+c.multiplication(6,5));
        System.out.println("c.multiplication(6,6) = "+c.multiplication(6,6));
        System.out.println("c.multiplication(6,7) = "+c.multiplication(6,7));
        System.out.println("c.multiplication(6,8) = "+c.multiplication(6,8));
        System.out.println("c.multiplication(6,9) = "+c.multiplication(6,9));

    }
}
