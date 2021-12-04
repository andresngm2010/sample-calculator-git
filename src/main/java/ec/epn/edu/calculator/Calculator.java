package ec.epn.edu.calculator;

public class Calculator {

    private int Ans;

    public int addition(int a, int b){
        return a + b;
    }

    public int subtraction(int a, int b){
        return a - b;
    }

    public int division(int a, int b){
        return a / b;
    }

    public int multiplication(int a, int b){
        return a * b;
    }

    public int getAns() {
        return Ans;
    }

    public void setAns(int ans) {
        Ans = ans;
    }
}
