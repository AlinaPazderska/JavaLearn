package calculator;

import java.util.Scanner;

public class ReadClass {
    public double readDouble(){
        Scanner test = new Scanner(System.in);
        double i = 0;

        if(test.hasNextDouble()){
            i = test.nextDouble();
        }
        else {
            System.out.println("You have entered incorrect value");
        }
        return i;
    }
}
