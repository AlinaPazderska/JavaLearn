package calculator;h

public class Calculate {
    public static void main(String[] args) {
        ReadClass readClass = new ReadClass();
        double fn;
        double sn;

        System.out.println("Please enter first digit: ");
        fn = readClass.readDouble();
        System.out.println("Please enter second digit: ");
        sn = readClass.readDouble();

        Calculator calculator = new Calculator(fn, sn);

        System.out.println("Please choose an action");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Modulus");
        System.out.println("0. Result");
        System.out.println("Please choose point: ");

        int action = (int) readClass.readDouble();

        switch (action) {
            case 1:
                System.out.println(calculator.add());
                break;
            case 2:
                System.out.println(calculator.subtract());
                break;
            case 3:
                System.out.println(calculator.multiply());
                break;
            case 4:
                System.out.println(calculator.divide());
                break;
            case 5:
                System.out.println(calculator.modulus());
                break;
            case 0:
                break;
            default:
                System.out.println("Please choose point from 1 to 5");
        }
    }
}
