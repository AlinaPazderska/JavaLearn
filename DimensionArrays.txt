public class DimensionArrays {
    public static void main(String[] args) {
        double multiArrayOfDoubles[][] = new double[3][3];

        multiArrayOfDoubles[0][0] = 1.0;
        multiArrayOfDoubles[1][0] = 1.5;
        multiArrayOfDoubles[2][0] = 2.0;
        multiArrayOfDoubles[0][1] = 1.5;
        multiArrayOfDoubles[1][1] = 2.0;
        multiArrayOfDoubles[2][1] = 2.5;
        multiArrayOfDoubles[0][2] = 2.0;
        multiArrayOfDoubles[1][2] = 2.5;
        multiArrayOfDoubles[2][2] = 3.0;

        System.out.print("The sum of the diagonal array products: ");
        System.out.println(multiArrayOfDoubles[0][0] + multiArrayOfDoubles[1][1] + multiArrayOfDoubles[2][2]);

        System.out.print("The product of the middle multiplication of the row and the middle column of the array: ");
        System.out.println(multiArrayOfDoubles[1][0] * multiArrayOfDoubles[1][1] * multiArrayOfDoubles[1][2] *
                multiArrayOfDoubles[0][1] * multiArrayOfDoubles[1][1] * multiArrayOfDoubles[2][1]);

        System.out.print("The sum of all elements at the edge of the board: ");
        System.out.println(multiArrayOfDoubles[0][0] + multiArrayOfDoubles[0][1] + multiArrayOfDoubles[0][2] +
                multiArrayOfDoubles[1][0] + multiArrayOfDoubles[1][2] +
                multiArrayOfDoubles[2][0] + multiArrayOfDoubles[2][1] + multiArrayOfDoubles[2][2]);

    }
}
