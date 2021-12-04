package ec.epn.edu.calculator;

public class CalculatorExecute {

    public static void main(String[] args){
        System.out.println("== Calculator Execute ==");

        Calculator c = new Calculator();
        System.out.println("c.addition(4,7) = "+c.addition(4,7));

        System.out.println("c.subtraction(9,2) = "+c.subtraction(9,2));
    }
}
