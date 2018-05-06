package calculator;

public class Calculator {
    private double a;
    private double b;

    public Calculator(){
        this.a = 0;
        this.b = 0;
    }
    public Calculator(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double add(){
        return a + b;
    }
    public double subtract(){
        return a - b;
    }
    public double multiply(){
        return a * b;
    }
    public double divide(){
        return a / b;
    }
    public double modulus(){
        return a % b;
    }
}
